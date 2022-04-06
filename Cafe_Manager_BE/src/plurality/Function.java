package plurality;

import java.util.Scanner;

import BE.Customer;

public class Function {
	public void printBill() {
		Customers cs = new Customers();
		cs.printSQL();
		Customer c = new Customer();
		int button;
		Scanner sc = new Scanner(System.in);
		button = sc.nextInt();
		if(button == 1) {
			c.input();
			cs.push(c);
		}else {
			String id;
			id = sc.nextLine();
			c.setId(id);
			cs.push(c);
		}
	}
}
