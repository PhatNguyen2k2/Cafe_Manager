package plurality;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;
import java.util.Vector;

import BE.Drinks_Order;

public class Drinks_Orders {
	private Vector<Drinks_Order> v;
	public Drinks_Orders() {
		v = new Vector<Drinks_Order>();
	}
	public void read() {//read from file
		String url = "D:\\eclipse\\Github\\Cafe_Manager\\Cafe_Manager_BE\\src\\input_file\\drinks_order";
		FileInputStream fileInputStream;
		try {
			fileInputStream = new FileInputStream(url);
			Scanner sc = new Scanner(fileInputStream);
			for(int i = 0; i < 152; i++) {
				Drinks_Order d = new Drinks_Order();
				d.setC_id(sc.nextLine());
				d.setM_id(sc.nextLine());
				d.setAmount(sc.nextInt());
				String c = sc.nextLine();//catch "enter"
				v.add(d);
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
			for(int i = 0; i < v.size(); i++) {
			String sql = "INSERT INTO DRINK_ORDER VALUES"
					+"(?,?,?)";
			PreparedStatement st = cn.prepareStatement(sql);
			st.setString(1, v.elementAt(i).getC_id());
			st.setString(2, v.elementAt(i).getM_id());
			st.setInt(3, v.elementAt(i).getAmount());
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
