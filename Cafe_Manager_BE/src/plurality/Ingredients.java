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
import java.util.Queue;
import java.util.Scanner;

import BE.Ingredient;

public class Ingredients {
	private Queue<Ingredient> q;
	public Ingredients() {
		super();
		q = new LinkedList<Ingredient>();//hang doi uu tien
	}
	public void read() {//read from file
		String url = "D:\\eclipse\\Github\\Cafe_Manager\\Cafe_Manager_BE\\src\\input_file\\ingredient";
		FileInputStream fileInputStream;
		try {
			fileInputStream = new FileInputStream(url);
			Scanner sc = new Scanner(fileInputStream);
			for(int i = 0; i < 23; i++) {
				Ingredient o = new Ingredient();
				o.setId(sc.nextLine());
				o.setName(sc.nextLine());
				o.setUnit(sc.nextLine());
				o.setAmount(sc.nextInt());
				o.setPrice(sc.nextFloat());
				o.setDay(sc.nextInt());
				o.setMonth(sc.nextInt());
				o.setYear(sc.nextInt());
				o.setInventory(sc.nextInt());
				String l = sc.nextLine();//catch enter
				q.add(o);
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
			for(Ingredient element:q) {
				String sql = "INSERT INTO INGREDIENT VALUES"
						+"(?,?,?,?,?,?,?,?,?)";
				PreparedStatement st = cn.prepareStatement(sql);
				st.setString(1, element.getId());
				st.setString(2, element.getName());
				st.setInt(3, element.getAmount());
				st.setString(4, element.getUnit());
				st.setFloat(5, element.getPrice());
				st.setInt(6, element.getDay());
				st.setInt(7, element.getMonth());
				st.setInt(8, element.getYear());
				st.setInt(9, element.getInventory());
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
		for(Ingredient e:q) {
			System.out.println("-->Ingredient "+(i+1));
			e.print();
			i++;
		}
	}
	public void printSQL() {//read data from sql
		q.clear();
		String url = "jdbc:sqlserver://FAT\\SQLEXPRESS:1433;databaseName=CAFE_MANAGER;user=sa;password=phat12112002;encrypt=false";
		Connection cn;
		try {
			cn = DriverManager.getConnection(url);
			String sql = "SELECT * FROM INGREDIENT";
			Statement st = cn.createStatement();
			ResultSet result = st.executeQuery(sql);
			while(result.next()) {
				Ingredient i = new Ingredient();
				i.setId(result.getString("I_id"));
				i.setName(result.getString("name"));
				i.setAmount(result.getInt("amount"));
				i.setUnit(result.getString("unit"));
				i.setPrice(result.getFloat("price"));
				i.setDay(result.getInt("Iday"));
				i.setMonth(result.getInt("Imonth"));
				i.setYear(result.getInt("Iyear"));
				i.setInventory(result.getInt("inventory"));
				q.add(i);
			}
			cn.close();
		}catch(SQLException e) {
			System.out.println("Oh no");
			e.printStackTrace();
		}
	}
}
