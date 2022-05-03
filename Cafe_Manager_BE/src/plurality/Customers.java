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
import java.util.Scanner;
import java.util.Stack;

import BE.Customer;
import design.EmployeeTB;

public class Customers {
	private static Stack<Customer>s;
	public Customers() {
		super();
		s = new Stack<Customer>();
	}
	public void read() {//read from file
		String url = "D:\\eclipse\\Github\\Cafe_Manager\\Cafe_Manager_BE\\src\\input_file\\customer";
		FileInputStream fileInputStream;
		try {
			fileInputStream = new FileInputStream(url);
			Scanner sc = new Scanner(fileInputStream);
			for(int i = 0; i < 30; i++) {
				Customer c = new Customer();
				c.setId(sc.nextLine());
				c.setSurname(sc.nextLine());
				c.setName(sc.nextLine());
				c.setGender(sc.nextLine());
				c.setAddress(sc.nextLine());
				c.setPhone(sc.nextLine());
				c.setMember(sc.nextLine());
				c.setDay(sc.nextInt());
				c.setMonth(sc.nextInt());
				c.setYear(sc.nextInt());
				c.setPoint(sc.nextInt());
				String l = sc.nextLine();//catch "enter"
				s.push(c);
			}
		} catch (FileNotFoundException e) {
			System.out.println("Oh no\n");
			e.printStackTrace();
		}
	}
	public void writeSQL() {//write data into sql
		String url = "jdbc:sqlserver://FAT\\SQLEXPRESS:1433;databaseName=CAFE_MANAGER;user=sa;password=phat12112002;encrypt=false";
		Connection cn;
		try {
			cn = DriverManager.getConnection(url);
			System.out.print("connect success\n");
			Iterator<Customer> it = s.iterator();
			while(it.hasNext()) {
				Customer u = new Customer();
				u = it.next();
			String sql = "INSERT INTO CUSTOMER VALUES"
					+"(?,?,?,?,?,?,?,?,?,?,?)";
			PreparedStatement st = cn.prepareStatement(sql);
			st.setString(1, u.getId());
			st.setString(2, u.getSurname());
			st.setString(3, u.getName());
			st.setString(4, u.getGender());
			st.setInt(5, u.getDay());
			st.setInt(6, u.getMonth());
			st.setInt(7, u.getYear());
			st.setString(8, u.getAddress());
			st.setInt(9, u.getPoint());
			st.setString(10, u.getMember());
			st.setString(11, u.getPhone());
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
	public static void writeidSQL(String id) {
		String url = "jdbc:sqlserver://FAT\\SQLEXPRESS:1433;databaseName=CAFE_MANAGER;user=sa;password=phat12112002;encrypt=false";
		Connection cn;
			try {
				cn = DriverManager.getConnection(url);
				System.out.print("connect success\n");
				String sql = "INSERT INTO CUSTOMER (C_id) VALUES (?)";
				PreparedStatement st = cn.prepareStatement(sql);
				st.setString(1, id);
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
		for(int i = 0; i< s.size(); i++) {
			System.out.println("-->Customer "+(i+1));
			s.elementAt(i).print();
		}
	}
	public void getData(String p) {//get data from sql
		String url = "jdbc:sqlserver://FAT\\SQLEXPRESS:1433;databaseName=CAFE_MANAGER;user=sa;password=phat12112002;encrypt=false";
		Connection cn;
		try {
			cn = DriverManager.getConnection(url);
			String sql = "SELECT * FROM CUSTOMER "+p;
			Statement st = cn.createStatement();
			ResultSet result = st.executeQuery(sql);
			while(result.next()) {
				Customer c = new Customer();
				c.setId(result.getString("C_id"));
				c.setSurname(result.getString("surname"));
				c.setName(result.getString("name"));
				c.setGender(result.getString("gender"));
				c.setDay(result.getInt("Bday"));
				c.setMonth(result.getInt("Bmonth"));
				c.setYear(result.getInt("Byear"));
				c.setAddress(result.getString("Caddress"));
				c.setPoint(result.getInt("point"));
				c.setMember(result.getString("member"));
				c.setPhone(result.getString("phone"));
				s.add(c);
			}
			cn.close();
		} catch (SQLException e) {
			System.out.println("Oh no");
			e.printStackTrace();
		}
	}
	public static Customer printSQL(String phone) {//find customer has "phone"
		Customer c = new Customer();
		String url = "jdbc:sqlserver://FAT\\SQLEXPRESS:1433;databaseName=CAFE_MANAGER;user=sa;password=phat12112002;encrypt=false";
		Connection cn;
		try {
			cn = DriverManager.getConnection(url);
			String sql = "SELECT TOP 1 * FROM CUSTOMER WHERE phone = '"+phone+"' ORDER BY C_id DESC";
			Statement st = cn.createStatement();
			ResultSet result = st.executeQuery(sql);
			while(result.next()) {
				c.setId(result.getString("C_id"));
				c.setSurname(result.getString("surname"));
				c.setName(result.getString("name"));
				c.setGender(result.getString("gender"));
				c.setDay(result.getInt("Bday"));
				c.setMonth(result.getInt("Bmonth"));
				c.setYear(result.getInt("Byear"));
				c.setAddress(result.getString("Caddress"));
				EmployeeTB.pointM = result.getInt("point");
				c.setPoint(EmployeeTB.pointM);
				EmployeeTB.memberM = result.getString("member");
				c.setMember(EmployeeTB.memberM);
				c.setPhone(result.getString("phone"));
			}
			cn.close();
		} catch (SQLException e) {
			System.out.println("Oh no");
			e.printStackTrace();
		}
		return c;
	}
	public static void updateCustomer(String id, Customer c) {
		String url = "jdbc:sqlserver://FAT\\SQLEXPRESS:1433;databaseName=CAFE_MANAGER;user=sa;password=phat12112002;encrypt=false";
		Connection cn;
			try {
				cn = DriverManager.getConnection(url);
				String sql = "UPDATE CUSTOMER SET surname=?,name =?,gender=?,Bday=?,Bmonth=?,Byear=?,Caddress=?,point=?,member=?,phone=? WHERE C_id = '"+id+"'";
				PreparedStatement st = cn.prepareStatement(sql);
				st.setString(1, c.getSurname());
				st.setString(2, c.getName());
				st.setString(3, c.getGender());
				st.setInt(4, c.getDay());
				st.setInt(5, c.getMonth());
				st.setInt(6, c.getYear());
				st.setString(7, c.getAddress());
				st.setInt(8, c.getPoint());
				st.setString(9, c.getMember());
				st.setString(10, c.getPhone());
				int rows = st.executeUpdate();
				if(rows > 0) {
					System.out.print("row has been updated\n");
				}
				cn.close();
			} catch (SQLException e) {
				System.out.print("oh no.");
				e.printStackTrace();
			}
	}

	public String getBottomId() { //get bottom id from sql
		String id = "";
		String url = "jdbc:sqlserver://FAT\\SQLEXPRESS:1433;databaseName=CAFE_MANAGER;user=sa;password=phat12112002;encrypt=false";
		Connection cn;
		try {
			cn = DriverManager.getConnection(url);
			String sql = "SELECT TOP 1 C_id FROM CUSTOMER ORDER BY C_id DESC";
			Statement st = cn.createStatement();
			ResultSet result = st.executeQuery(sql);
			while(result.next()) {
				id = result.getString("C_id");
			}
			cn.close();
		} catch (SQLException e) {
			System.out.println("Oh no");
			e.printStackTrace();
		}
		return id;
	}
	public void push(Customer c) {
		s.push(c);
	}
	public Iterator<Customer> iterator() {
		return s.iterator();
	}
}
