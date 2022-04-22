package plurality;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import BE.Account;

public class Accounts {
	private Account[] ac;

	public Accounts() {
		super();
		ac = new Account[4];
	}
	public void printSQL() {//read data from sql
		String url = "jdbc:sqlserver://FAT\\SQLEXPRESS:1433;databaseName=CAFE_MANAGER;user=sa;password=phat12112002;encrypt=false";
		Connection cn;
		try {
			cn = DriverManager.getConnection(url);
			String sql = "SELECT * FROM ACCOUNT";
			Statement st = cn.createStatement();
			ResultSet result = st.executeQuery(sql);
			int i = 0;
			while(result.next()) {
				Account a = new Account();
				a.setUsername(result.getString("username"));
				a.setPasswords(result.getString("passwords"));
				a.setE_id(result.getString("E_id"));
				ac[i] = a;
				i++;
			}
		} catch (SQLException e) {
			System.out.println("Oh no");
			e.printStackTrace();
		}
	}
	public boolean check(String user, String pass) {
		for(int i = 0; i < 4; i++) {
			if(ac[i].getUsername().equals(user) && ac[i].getPasswords().equals(pass))
				return true;
		}
		return false;
	}
	public void print() {
		for(int i = 0; i<4; i++) {
			ac[i].print();
		}
	}
}
