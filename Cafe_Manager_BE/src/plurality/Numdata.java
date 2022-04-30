package plurality;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import BE.Amount;

public class Numdata {
	public List<Amount> num;
	public Numdata() {
		num = new ArrayList<Amount>();
	}

	public void add(Amount x) {
		num.add(x);
	}
	public void print() {
		for(Amount i : num) {
			i.print();
		}
	}

	public Iterator<Amount> iterator() {
		return num.iterator();
	}
}
