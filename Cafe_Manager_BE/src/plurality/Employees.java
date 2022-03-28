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
			for(int i = 0; i < 10; i++) {
				Employee e = new Employee();
				e.setId(sc.nextLine());
				e.setSurname(sc.nextLine());
				e.setName(sc.nextLine());
				e.setGender(sc.nextLine());
				e.setAddress(sc.nextLine());
				e.setPhone(sc.nextLine());
				e.setPosition(sc.nextLine());
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
	public void writeSQL() {//write data into sql
		String url = "jdbc:sqlserver://FAT\\SQLEXPRESS:1433;databaseName=CAFE_MANAGER;user=sa;password=phat12112002;encrypt=false";
		Connection cn;
		try {
			cn = DriverManager.getConnection(url);
			System.out.print("connect success\n");
			for(int i = 0; i < 10; i++) {
			String sql = "INSERT INTO EMPLOYEE VALUES"
					+"(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
			PreparedStatement st = cn.prepareStatement(sql);
			st.setString(1, v.elementAt(i).getId());
			st.setString(2, v.elementAt(i).getSurname());
			st.setString(3, v.elementAt(i).getName());
			st.setString(4, v.elementAt(i).getGender());
			st.setInt(5, v.elementAt(i).getDay());
			st.setInt(6, v.elementAt(i).getMonth());
			st.setInt(7, v.elementAt(i).getYear());
			st.setString(8, v.elementAt(i).getAddress());
			st.setString(9, v.elementAt(i).getPhone());
			st.setInt(10, v.elementAt(i).getWorking_hour());
			st.setFloat(11, v.elementAt(i).getBonus());
			st.setFloat(12, v.elementAt(i).getMinus());
			st.setFloat(13, v.elementAt(i).getCoefficients());
			st.setFloat(14, v.elementAt(i).getSalary());
			st.setFloat(15, v.elementAt(i).getExperience());
			st.setString(16, v.elementAt(i).getPosition());
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
		for(int i = 0; i< v.size(); i++) {
			System.out.println("-->Employee "+(i+1));
			v.elementAt(i).print();
		}
	}
	public void printSQL() {//read data from sql
		v.clear();
		String url = "jdbc:sqlserver://FAT\\SQLEXPRESS:1433;databaseName=CAFE_MANAGER;user=sa;password=phat12112002;encrypt=false";
		Connection cn;
		try {
			cn = DriverManager.getConnection(url);
			String sql = "SELECT * FROM EMPLOYEE";
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
				v.add(e);
			}
			cn.close();
		} catch (SQLException e) {
			System.out.println("Oh no");
			e.printStackTrace();
		}
	}
}
