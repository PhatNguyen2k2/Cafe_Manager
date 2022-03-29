package BE;

import java.util.Scanner;

public class Ingredient {
	private String id;
	private String name;
	private int amount;
	private String unit;
	private float price;
	private int day;
	private int month;
	private int year;
	private int inventory;
	public Ingredient() {
		super();
		id = "";
		name = "";
		unit = "";
		amount = 0;
		price = 0;
		day = 0;
		month = 0;
		year = 0;
		inventory = 0;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public String getUnit() {
		return unit;
	}
	public void setUnit(String unit) {
		this.unit = unit;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getInventory() {
		return inventory;
	}
	public void setInventory(int inventory) {
		this.inventory = inventory;
	}
	public void input() {
		Scanner sc = new Scanner(System.in);
		id = sc.nextLine();
		name = sc.nextLine();
		unit = sc.nextLine();
		amount = sc.nextInt();
		price = sc.nextFloat();
		day = sc.nextInt();
		month = sc.nextInt();
		year = sc.nextInt();
		inventory = sc.nextInt();
	}
	public void print() {
		System.out.println("Id: "+id+", Name: "+name+", Unit: "+unit+" Amount: "+amount+", Price: "+price+", Date: "+day+"/"+month+"/"+year+", Inventory: "+inventory);
	}
}
