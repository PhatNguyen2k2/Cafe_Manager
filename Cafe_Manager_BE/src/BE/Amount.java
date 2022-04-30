package BE;

public class Amount {
	public String id;
	public int number;
	public Amount() {
		id = "";
		number = 0;
	}
	public void print() {
		System.out.println(id+", "+number);
	}
}
