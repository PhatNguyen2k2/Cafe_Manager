package BE;

public class Account {
	private String username;
	private String passwords;
	private String E_id;
	public Account() {
		super();
		username = "";
		passwords = "";
		E_id = "";
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPasswords() {
		return passwords;
	}
	public void setPasswords(String passwords) {
		this.passwords = passwords;
	}
	public String getE_id() {
		return E_id;
	}
	public void setE_id(String e_id) {
		E_id = e_id;
	}
	public void print() {
		System.out.println("username: "+username+", password: "+passwords+", E_id: "+E_id);
	}
}
