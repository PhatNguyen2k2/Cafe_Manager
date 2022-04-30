package BE;

import java.util.Scanner;

public class Bill {
	private String id;
	private int hour;
	private int minute;
	private String C_id;
	private String E_id;
	private String name;
	private String price;
	private int amount;
	public Bill() {
		super();
		id = "";
		hour = 0;
		minute = 0;
		C_id = "";
		E_id = "";
		name = "";
		price = "";
		amount = 0;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getHour() {
		return hour;
	}
	public void setHour(int hour) {
		this.hour = hour;
	}
	public int getMinute() {
		return minute;
	}
	public void setMinute(int minute) {
		this.minute = minute;
	}
	public String getC_id() {
		return C_id;
	}
	public void setC_id(String c_id) {
		C_id = c_id;
	}
	public String getE_id() {
		return E_id;
	}
	public void setE_id(String e_id) {
		E_id = e_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public void input() {
		Scanner sc = new Scanner(System.in);
		id = sc.nextLine();
		C_id = sc.nextLine();
		E_id = sc.nextLine();
		hour = sc.nextInt();
		minute = sc.nextInt();
	}
	public void print() {
		System.out.println("Id: "+id+", C_id: "+C_id+hour+"h"+minute+", Name: "+name+", Price: "+price);
	}
}
