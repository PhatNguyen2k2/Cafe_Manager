package plurality;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import BE.Drinks;

public class Menu  {
	private ArrayList<Drinks> ar;
	public Menu() {
		super();
		ar = new ArrayList<Drinks>();
	}
	public void read() {//read from file
		String url = "D:\\eclipse\\Github\\Cafe_Manager\\Cafe_Manager_BE\\src\\input_file\\menu";
		FileInputStream fileInputStream;
		try {
			fileInputStream = new FileInputStream(url);
			Scanner sc = new Scanner(fileInputStream);
			for(int i = 0; i < 21; i++) {
				Drinks d = new Drinks();
				d.setId(sc.nextLine());
				d.setName(sc.nextLine());
				d.setPrice(sc.nextFloat());
				String c = sc.nextLine();//catch "enter"
				ar.add(d);
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
			for(Drinks i:ar) {
			String sql = "INSERT INTO MENU VALUES"
					+"(?,?,?)";
			PreparedStatement st = cn.prepareStatement(sql);
			st.setString(1, i.getId());
			st.setString(2, i.getName());
			st.setFloat(3, i.getPrice());
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
		for(Drinks a:ar) {
			System.out.println("-->Drinks "+(i+1));
			a.print();
		}
	}
	public void printSQL() {//read data from sql
		ar.clear();
		String url = "jdbc:sqlserver://FAT\\SQLEXPRESS:1433;databaseName=CAFE_MANAGER;user=sa;password=phat12112002;encrypt=false";
		Connection cn;
		try {
			cn = DriverManager.getConnection(url);
			String sql = "SELECT * FROM MENU";
			Statement st = cn.createStatement();
			ResultSet result = st.executeQuery(sql);
			while(result.next()) {
				Drinks d = new Drinks();
				d.setId(result.getString("M_id"));
				d.setName(result.getString("name"));
				d.setPrice(result.getFloat("price"));
				ar.add(d);
			}
			cn.close();
		} catch (SQLException e) {
			System.out.println("Oh no");
			e.printStackTrace();
		}
	}
	public Iterator<Drinks> iterator() {
		return ar.iterator();
	}
}
