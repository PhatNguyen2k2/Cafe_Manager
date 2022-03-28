package BE;

public class Program {

	public static void main(String[] args) {
		Employees e = new Employees();
		e.read();
		e.writeSQL();
		e.printSQL();
		e.print();
	}

}
