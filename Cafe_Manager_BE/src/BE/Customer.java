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
}
