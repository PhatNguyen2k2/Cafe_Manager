package plurality;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import java.util.Vector;

import BE.Employee;


public class Employees {
	private Vector<Employee>v;
	public Employees() {
		super();
		v = new Vector<Employee>();
	}
	public void read() {//read from file
		String url = "D:\\eclipse\\Github\\Cafe_Manager\\Cafe_Manager_BE\\src\\input_file\\employee";
		FileInputStream fileInputStream;
		try {
			fileInputStream = new FileInputStream(url);
			Scanner sc = new Scanner(fileInputStream);
			for(int i = 0; i < 19; i++) {
				Employee e = new Employee();
				e.setId(sc.nextLine());
				e.setSurname(sc.nextLine());
				e.setName(sc.nextLine());
				e.setGender(sc.nextLine());
				e.setAddress(sc.nextLine());
				e.setPhone(sc.nextLine());
				e.setPosition(sc.nextLine());
				e.setManager(sc.nextLine());
				e.setDay(sc.nextInt());
				e.setMonth(sc.nextInt());
				e.setYear(sc.nextInt());
				e.setWorking_hour(sc.nextInt());
				e.setBonus(sc.nextFloat());
				e.setMinus(sc.nextFloat());
				e.setCoefficients(sc.nextFloat());
				e.setSalary(sc.nextFloat());
				e.setExperience(sc.nextFloat());
				String c = sc.nextLine();//catch "enter"
				v.add(e);
			}
		} catch (FileNotFoundException e) {
			System.out.println("Oh no\n");
			e.printStackTrace();
		}
	}
	public static void writeSQL(Employee em) {//write data into sql
		String url = "jdbc:sqlserver://FAT\\SQLEXPRESS:1433;databaseName=CAFE_MANAGER;user=sa;password=phat12112002;encrypt=false";
		Connection cn;
		try {
			cn = DriverManager.getConnection(url);
			System.out.print("connect success\n");
			String sql = "INSERT INTO EMPLOYEE VALUES"
					+"(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
			PreparedStatement st = cn.prepareStatement(sql);
			st.setString(1, em.getId());
			st.setString(2, em.getSurname());
			st.setString(3, em.getName());
			st.setString(4, em.getGender());
			st.setInt(5, em.getDay());
			st.setInt(6, em.getMonth());
			st.setInt(7, em.getYear());
			st.setString(8, em.getAddress());
			st.setString(9, em.getPhone());
			st.setInt(10, em.getWorking_hour());
			st.setFloat(11, em.getBonus());
			st.setFloat(12, em.getMinus());
			st.setFloat(13, em.getCoefficients());
			st.setFloat(14, em.getSalary());
			st.setFloat(15, em.getExperience());
			st.setString(16, em.getPosition());
			st.setString(17, em.getManager());
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
		for(int i = 0; i< v.size(); i++) {
			System.out.println("-->Employee "+(i+1));
			v.elementAt(i).print();
		}
	}
	public void printSQL(String p) {//read data from sql
		v.clear();
		String url = "jdbc:sqlserver://FAT\\SQLEXPRESS:1433;databaseName=CAFE_MANAGER;user=sa;password=phat12112002;encrypt=false";
		Connection cn;
		try {
			cn = DriverManager.getConnection(url);
			String sql = "SELECT * FROM EMPLOYEE "+p;
			Statement st = cn.createStatement();
			ResultSet result = st.executeQuery(sql);
			while(result.next()) {
				Employee e = new Employee();
				e.setId(result.getString("E_id"));
				e.setSurname(result.getString("surname"));
				e.setName(result.getString("name"));
				e.setGender(result.getString("gender"));
				e.setDay(result.getInt("Bday"));
				e.setMonth(result.getInt("Bmonth"));
				e.setYear(result.getInt("Byear"));
				e.setAddress(result.getString("Eaddress"));
				e.setPhone(result.getString("phone"));
				e.setWorking_hour(result.getInt("working_hour"));
				e.setBonus(result.getFloat("bonus"));
				e.setMinus(result.getFloat("minus"));
				e.setCoefficients(result.getFloat("coefficients"));
				e.setSalary(result.getFloat("salary"));
				e.setExperience(result.getFloat("experience"));
				e.setPosition(result.getString("position"));
				e.setManager(result.getString("manager"));
				v.add(e);
			}
			cn.close();
		} catch (SQLException e) {
			System.out.println("Oh no");
			e.printStackTrace();
		}
	}
	public static String getBottomId() {
		String id = "";
		String url = "jdbc:sqlserver://FAT\\SQLEXPRESS:1433;databaseName=CAFE_MANAGER;user=sa;password=phat12112002;encrypt=false";
		Connection cn;
		try {
			cn = DriverManager.getConnection(url);
			String sql = "SELECT TOP 1 E_id FROM EMPLOYEE ORDER BY E_id DESC";
			Statement st = cn.createStatement();
			ResultSet result = st.executeQuery(sql);
			while(result.next()) {
				id = result.getString("E_id");
			}
			cn.close();
		} catch (SQLException e) {
			System.out.println("Oh no");
			e.printStackTrace();
		}
		return id;
	}
	public static String findId(String id) {
		String rs = "";
		String url = "jdbc:sqlserver://FAT\\SQLEXPRESS:1433;databaseName=CAFE_MANAGER;user=sa;password=phat12112002;encrypt=false";
		Connection cn;
		try {
			cn = DriverManager.getConnection(url);
			String sql = "SELECT E_id FROM EMPLOYEE WHERE E_id = "+id;
			Statement st = cn.createStatement();
			ResultSet result = st.executeQuery(sql);
			while(result.next()) {
				rs = result.getString("E_id");
			}
			cn.close();
		} catch (SQLException e) {
			System.out.println("Oh no");
			e.printStackTrace();
		}
		return rs;
	}
	public static void deleteEmployee(String id) {
		String url = "jdbc:sqlserver://FAT\\SQLEXPRESS:1433;databaseName=CAFE_MANAGER;user=sa;password=phat12112002;encrypt=false";
		Connection cn;
		try {
			cn = DriverManager.getConnection(url);
			String sql = "DELETE FROM EMPLOYEE WHERE E_id = "+id;
			PreparedStatement st = cn.prepareStatement(sql);
			int rows = st.executeUpdate();
			if(rows > 0) {
				System.out.print("row has been deleted\n");
			}
			cn.close();
		} catch (SQLException e) {
			System.out.print("oh no.");
			e.printStackTrace();
		}
	}
	public static void updateEmployee(String id, Employee em) {
		String url = "jdbc:sqlserver://FAT\\SQLEXPRESS:1433;databaseName=CAFE_MANAGER;user=sa;password=phat12112002;encrypt=false";
		Connection cn;
			try {
				cn = DriverManager.getConnection(url);
				String sql = "UPDATE EMPLOYEE SET surname=?,name =?,gender=?,Bday=?,Bmonth=?,Byear=?,Eaddress=?,phone=?,working_hour=?,bonus=?,minus=?,coefficients=?,salary=?,experience=?,position=? WHERE E_id = '"+id+"'";
				PreparedStatement st = cn.prepareStatement(sql);
				st.setString(1, em.getSurname());
				st.setString(2, em.getName());
				st.setString(3, em.getGender());
				st.setInt(4, em.getDay());
				st.setInt(5, em.getMonth());
				st.setInt(6, em.getYear());
				st.setString(7, em.getAddress());
				st.setString(8, em.getPhone());
				st.setInt(9, em.getWorking_hour());
				st.setFloat(10, em.getBonus());
				st.setFloat(11, em.getMinus());
				st.setFloat(12, em.getCoefficients());
				st.setFloat(13, em.getSalary());
				st.setFloat(14, em.getExperience());
				st.setString(15, em.getPosition());
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
	public Employee elementAt(int i) {
		return v.elementAt(i);
		
	}
	public int size() {
		return v.size();
	}
}
