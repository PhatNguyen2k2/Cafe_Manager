package main;

import plurality.Bills;
import plurality.Customers;
import plurality.Drinks_Orders;
import plurality.Employees;
import plurality.Ingredients;
import plurality.Menu;

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
		Menu m = new Menu();
		m.read();
		m.writeSQL();
		m.printSQL();
		m.print();
		Drinks_Orders d = new Drinks_Orders();
		d.read();
		d.writeSQL();
		Bills b = new Bills();
		b.read();
		b.writeSQL();
		b.printSQL();
		b.print();
	}
}
