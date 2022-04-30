package plurality;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Iterator;
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
	public static void writeSQL(String bid, String cid, String eid) {//write data into sql
		String url = "jdbc:sqlserver://FAT\\\\SQLEXPRESS:1433;databaseName=CAFE_MANAGER;user=sa;password=phat12112002;encrypt=false";
		Connection cn;
		try {
			cn = DriverManager.getConnection(url);
			System.out.print("connect success\n");
				String sql = "INSERT INTO BILL (B_id, C_id, E_id) VALUES"
						+"(?,?,?)";
				PreparedStatement st = cn.prepareStatement(sql);
				st.setString(1, bid);
				st.setString(2, cid);
				st.setString(3, eid);
				int rows = st.executeUpdate();
				if(rows > 0) {
					System.out.print("row has been inserted\n");
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
	public void printSQL(String id) {//read data from sql
		ll.clear();
		String url = "jdbc:sqlserver://FAT\\SQLEXPRESS:1433;databaseName=CAFE_MANAGER;user=sa;password=phat12112002;encrypt=false";
		Connection cn;
		try {
			cn = DriverManager.getConnection(url);
			String sql = "SELECT M.name, DO.amount,(STR(M.price,6,2)+ ' VND') AS price FROM BILL B, DRINK_ORDER DO, MENU M WHERE B.C_id = DO.C_id AND DO.M_id = M.M_id AND B.C_id = '"+id+"'";
			Statement st = cn.createStatement();
			ResultSet result = st.executeQuery(sql);
			while(result.next()) {
				Bill b = new Bill();
				b.setName(result.getString("name"));
				b.setAmount(result.getInt("amount"));
				b.setPrice(result.getString("price"));
				ll.add(b);
			}
			cn.close();
		}catch(SQLException e) {
			System.out.println("Oh no");
			e.printStackTrace();
		}
	}
	public static float getTotal(String id) {
		float total = 0;
		String url = "jdbc:sqlserver://FAT\\SQLEXPRESS:1433;databaseName=CAFE_MANAGER;user=sa;password=phat12112002;encrypt=false";
		Connection cn;
		try {
			cn = DriverManager.getConnection(url);
			String sql = "SELECT SUM(M.price*DO.amount) AS Total FROM BILL B, DRINK_ORDER DO, MENU M WHERE B.C_id = DO.C_id AND DO.M_id = M.M_id AND B.C_id = '"+id+"' GROUP BY B.B_id, B.E_id, DO.C_id";
			Statement st = cn.createStatement();
			ResultSet result = st.executeQuery(sql);
			while(result.next()) {
				total = result.getFloat("Total");
			}
			cn.close();
		}catch(SQLException e) {
			System.out.println("Oh no");
			e.printStackTrace();
		}
		return total;
	}
	public String getBottomId() { //get bottom id from sql
		String id = "";
		String url = "jdbc:sqlserver://FAT\\SQLEXPRESS:1433;databaseName=CAFE_MANAGER;user=sa;password=phat12112002;encrypt=false";
		Connection cn;
		try {
			cn = DriverManager.getConnection(url);
			String sql = "SELECT TOP 1 B_id FROM BILL ORDER BY B_id DESC";
			Statement st = cn.createStatement();
			ResultSet result = st.executeQuery(sql);
			while(result.next()) {
				id = result.getString("B_id");
			}
			cn.close();
		}catch(SQLException e) {
			System.out.println("Oh no");
			e.printStackTrace();
		}
		return id;
	}
	public static int getPlusPoint(String id) {
		int plus = 0;
		String url = "jdbc:sqlserver://FAT\\SQLEXPRESS:1433;databaseName=CAFE_MANAGER;user=sa;password=phat12112002;encrypt=false";
		Connection cn;
		try {
			cn = DriverManager.getConnection(url);
			String sql = "SELECT SUM(DO.amount) AS plusPoint FROM BILL B, DRINK_ORDER DO WHERE B.C_id = DO.C_id  AND B.C_id = '"+id+"' GROUP BY B.B_id, B.E_id, DO.C_id";
			Statement st = cn.createStatement();
			ResultSet result = st.executeQuery(sql);
			while(result.next()) {
				plus = result.getInt("plusPoint");
			}
			cn.close();
		}catch(SQLException e) {
			System.out.println("Oh no");
			e.printStackTrace();
		}
		return plus;
	}
	public Iterator<Bill> iterator() {
		return ll.iterator();
	}
}
