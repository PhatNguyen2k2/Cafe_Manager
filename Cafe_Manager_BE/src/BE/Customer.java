package BE;

import java.util.Scanner;

public class Customer extends MapPerson{
	private int point;
	private String member;
	public Customer() {
		super();
		point = 0;
		member = "";
	}
	public void input() {
		super.input();
		Scanner sc = new Scanner(System.in);
		point = sc.nextInt();
		member = sc.nextLine();
	}
	public void print() {
		super.print();
		System.out.println("Point: "+point+", Member: "+member);
	}
	public void setPoint(int point) {
		this.point = point;
	}
	public void setMember(String member) {
		this.member = member;
	}
	public int getPoint() {
		return point;
	}
	public String getMember() {
		return member;
	}
	public static float checkMember(String member) {
		float discount = 0;
		if(member.equals("gold"))
			discount = (float) 0.1;
		else if (member.equals("silver"))
			discount = (float) 0.09;
		else if(member.equals("bronze"))
			discount = (float) 0.07;
		else if(member.equals("loyal"))
			discount = (float) 0.05;
		else discount = 0;
		return discount;
	}
	public static String checkPoint(int point) {
		String member = "";
		if(point >= 500)
			member = "gold";
		else if(point >= 250)
			member = "silver";
		else if(point >= 100)
			member = "bronze";
		else if(point >= 50)
			member = "loyal";
		else return "normal";
		return member;
	}
}
