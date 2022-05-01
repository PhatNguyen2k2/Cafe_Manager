package BE;

import java.util.Scanner;

public class Employee extends MapPerson{
	private int working_hour;
	private float bonus;
	private float minus;
	private float coefficients;
	private float salary;
	private float experience;
	private String position;
	private String manager;
	public Employee(){
		super();
		working_hour = 0;
		bonus = 0;
		minus = 0;
		coefficients = 0;
		salary = 0;
		experience = 0;
		position = "";
		manager = "";
	}
	public void setWorking_hour(int working_hour) {
		this.working_hour = working_hour;
	}
	public void setBonus(float bonus) {
		this.bonus = bonus;
	}
	public void setMinus(float minus) {
		this.minus = minus;
	}
	public void setCoefficients(float coefficients) {
		this.coefficients = coefficients;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public void setExperience(float experience) {
		this.experience = experience;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public int getWorking_hour() {
		return working_hour;
	}
	public float getBonus() {
		return bonus;
	}
	public float getMinus() {
		return minus;
	}
	public float getCoefficients() {
		return coefficients;
	}
	public float getSalary() {
		return salary;
	}
	public float getExperience() {
		return experience;
	}
	public String getPosition() {
		return position;
	}
	public String getManager() {
		return manager;
	}
	public void setManager(String manager) {
		this.manager = manager;
	}
	public void input() {
		super.input();
		Scanner sc = new Scanner(System.in);
		working_hour = sc.nextInt();
		bonus = sc.nextFloat();
		minus = sc.nextFloat();
		coefficients = sc.nextFloat();
		salary = sc.nextFloat();
		experience = sc.nextFloat();
		position = sc.next();
		manager = sc.next();
	}
	public static boolean timeTest(int day, int month, int year){
	    if (year<0 || month<0 || month> 12 || day<0 || day> 31) return false;
	    if(month==1 || month ==3 || month == 5 || month ==7 || month ==8 || month ==10 || month==12){
	        if(day <= 31) return true;
	    }
	    if(month==4 || month ==6 || month == 9 || month ==11){
	        if(day <= 30) return true;
	    }  
	    if(year %4 ==0 && year !=0){
	        if(day <= 29) return true;
	    }  
	    else{
	        if(day <= 28) return true;
	    }
	    return false;
	}
	public void print() {
		super.print();
		System.out.println("Working hour: "+working_hour+", Bonus: "+bonus+", Minus: "+minus+", Coefficients: "+coefficients+", Salary: "+salary+", Experience: "+experience+", Position: "+position+", Manager: "+manager);
	}
}
