package BE;

import java.util.Scanner;

public class MapPerson {
	private String id;
	private String surname;
	private String name;
	private String gender;
	private int day;
	private int month;
	private int year;
	private String address ;
	private String phone;
	public MapPerson() {
		id = "";
		surname="";
		name = "";
		gender = "";
		day = 0;
		month = 0;
		year = 0;
		address = "";
		phone = "";
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public void input() {
		Scanner sc = new Scanner(System.in);
		id = sc.nextLine();
		surname = sc.nextLine();
		name = sc.nextLine();
		gender = sc.nextLine();
		address = sc.nextLine();
		day = sc.nextInt();
		month = sc.nextInt();
		year = sc.nextInt();
		phone = sc.nextLine();
	}
	public void print() {
		System.out.println("Id: "+id+", Name: "+surname+" "+name+", Gender: "+gender+", ("+day+"/"+month+"/"+year+"), Address: "+address+", Phone: "+phone);
	}
}
