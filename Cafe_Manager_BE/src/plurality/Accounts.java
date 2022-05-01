package plurality;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;

import BE.Account;

public class Accounts {
	private Vector<Account> ac;

	public Accounts() {
		super();
		ac = new Vector<Account>();
	}
	public void printSQL(String user) {//read data from sql with username
		String url = "jdbc:sqlserver://FAT\\SQLEXPRESS:1433;databaseName=CAFE_MANAGER;user=sa;password=phat12112002;encrypt=false";
		Connection cn;
		try {
			cn = DriverManager.getConnection(url);
			String sql = "SELECT * FROM ACCOUNT WHERE username LIKE '"+user+"'";
			Statement st = cn.createStatement();
			ResultSet result = st.executeQuery(sql);
			while(result.next()) {
				Account a = new Account();
				a.setUsername(result.getString("username"));
				a.setPasswords(result.getString("passwords"));
				a.setMother(result.getString("motherName"));
				a.setE_id(result.getString("E_id"));
				ac.add(a);
			}
		} catch (SQLException e) {
			System.out.println("Oh no");
			e.printStackTrace();
		}
	}
	public String printNameSQL(String user) { //read name of account in SQL
		String name = "";
		String url = "jdbc:sqlserver://FAT\\SQLEXPRESS:1433;databaseName=CAFE_MANAGER;user=sa;password=phat12112002;encrypt=false";
		Connection cn;
		try {
			cn = DriverManager.getConnection(url);
			String sql = "SELECT (E.surname + ' ' +E.name) AS Name FROM ACCOUNT A, EMPLOYEE E WHERE A.E_id = E.E_id AND A.username = '"+user+"'";
			Statement st = cn.createStatement();
			ResultSet result = st.executeQuery(sql);
			while(result.next()) {
				name = result.getString("Name");
			}
		} catch (SQLException e) {
			System.out.println("Oh no");
			e.printStackTrace();
		}
		return name;
	}
	public boolean check(String user, String pass) {
		for(int i = 0; i < 4; i++) {
			if(ac.elementAt(i).getUsername().equals(user) && ac.elementAt(i).getPasswords().equals(pass))
				return true;
		}
		return false;
	}
	public boolean checkMother(String user, String name) {
		for(int i = 0; i < 4; i++) {
			if(ac.elementAt(i).getUsername().equals(user) && ac.elementAt(i).getMother().equals(name))
				return true;
		}
		return false;
	}
	public String getPass(String user) {
		for(int i = 0; i < 4; i++) {
			if(ac.elementAt(i).getUsername().equals(user))
				return ac.elementAt(i).getPasswords();
		}
		return "";
	}
	public Account elementAt(int i) {
		return ac.elementAt(i);
	}
}
