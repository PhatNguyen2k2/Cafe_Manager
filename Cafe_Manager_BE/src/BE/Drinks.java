package BE;

import java.util.Scanner;

public class Drinks {
	private String id;
	private String name;
	private float price;
	public Drinks() {
		super();
		id = "";
		name = "";
		price = 0;
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
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public void input() {
		Scanner sc = new Scanner(System.in);
		id = sc.nextLine();
		name = sc.nextLine();
		price = sc.nextFloat();
	}
	public void print() {
		System.out.println("Id: "+id+", Name: "+name+", Price: "+price);
	}
}
