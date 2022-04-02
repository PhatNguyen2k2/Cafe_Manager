package plurality;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
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
		String url = "D:\\eclipse\\Github\\Cafe_Manager\\Cafe_Manager_BE\\src\\input_file\\ingredient";
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
				String sql = "INSERT INTO INGREDIENT VALUES"
						+"(?,?,?,?,?)";
				PreparedStatement st = cn.prepareStatement(sql);
				st.setString(1, element.getId());
				st.setString(2, element.getC_id());
				st.setString(3, element.getE_id());
				st.setInt(4, element.getHour());
				st.setInt(5, element.getMinute());
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
}
