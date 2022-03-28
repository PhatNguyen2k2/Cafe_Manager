package plurality;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Stack;

import BE.Customer;

public class Customers {
	private Stack<Customer>s;
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
			for(int i = 0; i < 2; i++) {
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
}
