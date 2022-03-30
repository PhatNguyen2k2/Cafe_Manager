package main;

import plurality.Customers;
import plurality.Employees;
import plurality.Ingredients;

public class Program {

	public static void main(String[] args) {
		Employees e = new Employees();
		e.read();
		e.writeSQL();
		e.printSQL();
		e.print();
		Customers c = new Customers();
		c.read();
		c.writeSQL();
		c.printSQL();
		c.print();
		Ingredients i = new Ingredients();
		i.read();
		i.writeSQL();
		i.printSQL();
		i.print();
	}
}
