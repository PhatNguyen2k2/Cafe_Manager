package plurality;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.Scanner;

import BE.Bill;

public class Bills {
	private LinkedList<Bill> ll;
	public Bills() {
		super();
		ll = new LinkedList<Bill>();
	}
	public void read() {//read from file
		String url = "D:\\eclipse\\Github\\Cafe_Manager\\Cafe_Manager_BE\\src\\input_file\\bill";
		FileInputStream fileInputStream;
		try {
			fileInputStream = new FileInputStream(url);
			Scanner sc = new Scanner(fileInputStream);
			for(int i = 0; i < 30; i++) {
				Bill b = new Bill();
				b.setId(sc.nextLine());
				b.setC_id(sc.nextLine());
				b.setE_id(sc.nextLine());
				b.setHour(sc.nextInt());
				b.setMinute(sc.nextInt());
				String l = sc.nextLine();//catch enter
				ll.add(b);
			}
		} catch (FileNotFoundException e) {
			System.out.println("Oh no\n");
			e.printStackTrace();
		}
	}
	public void writeSQL() {//write data into sql
		String url = "jdbc:sqlserver://FAT\\\\SQLEXPRESS:1433;databaseName=CAFE_MANAGER;user=sa;password=phat12112002;encrypt=false";
		Connection cn;
		try {
			cn = DriverManager.getConnection(url);
			System.out.print("connect success\n");
			for(Bill element:ll) {
				String sql = "INSERT INTO BILL VALUES"
						+"(?,?,?,?,?)";
				PreparedStatement st = cn.prepareStatement(sql);
				st.setString(1, element.getId());
				st.setInt(2, element.getHour());
				st.setInt(3, element.getMinute());
				st.setString(4, element.getC_id());
				st.setString(5, element.getE_id());
				int rows = st.executeUpdate();
				if(rows > 0) {
					System.out.print("row has been inserted\n");
				}
			}
			cn.close();
		} catch (SQLException e) {
			System.out.print("oh no.");
			e.printStackTrace();
		}
	}
	public void print() {
		int i = 0;
		for(Bill e:ll) {
			System.out.println("-->Ingredient "+(i+1));
			e.print();
			i++;
		}
	}
	public void printSQL() {//read data from sql
		ll.clear();
		String url = "jdbc:sqlserver://FAT\\SQLEXPRESS:1433;databaseName=CAFE_MANAGER;user=sa;password=phat12112002;encrypt=false";
		Connection cn;
		try {
			cn = DriverManager.getConnection(url);
			String sql = "SELECT DISTINCT B.B_id,B.E_id, B.Bhour, B.Bminute, (SELECT M.name + ':'+ STR(M.price,6,2)+ 'VND Amount: '+STR(DO1.amount,2,2)+ CHAR(13)+ CHAR(10) FROM MENU M INNER JOIN DRINK_ORDER DO1 ON M.M_id = DO1.M_id WHERE DO1.C_id = DO.C_id ORDER BY DO1.C_id FOR XML PATH(''))[name], (SELECT SUM(M.price*DO1.amount) FROM DRINK_ORDER DO1 INNER JOIN MENU M ON DO1.M_id = M.M_id WHERE DO1.C_id = DO.C_id GROUP BY DO1.C_id) AS Total FROM BILL B INNER JOIN DRINK_ORDER DO ON B.C_id = DO.C_id";
			Statement st = cn.createStatement();
			ResultSet result = st.executeQuery(sql);
			while(result.next()) {
				Bill b = new Bill();
				b.setId(result.getString("B_id"));
				b.setE_id(result.getString("E_id"));
				b.setHour(result.getInt("Bhour"));
				b.setMinute(result.getInt("Bminute"));
				b.setName(result.getString("name"));
				b.setName(b.getName().replace("&#x0D;", ""));
				b.setPrice(result.getFloat("Total"));
				ll.add(b);
			}
			cn.close();
		}catch(SQLException e) {
			System.out.println("Oh no");
			e.printStackTrace();
		}
	}
}
