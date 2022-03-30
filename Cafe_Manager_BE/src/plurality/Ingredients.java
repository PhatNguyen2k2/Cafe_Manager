package plurality;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

import BE.Ingredient;

public class Ingredients {
	private Queue<Ingredient> q;
	public Ingredients() {
		super();
		q = new PriorityQueue<Ingredient>();//hang doi uu tien
	}
	public void read() {//read from file
		String url = "D:\\eclipse\\Github\\Cafe_Manager\\Cafe_Manager_BE\\src\\input_file\\ingredient";
		FileInputStream fileInputStream;
		try {
			fileInputStream = new FileInputStream(url);
			Scanner sc = new Scanner(fileInputStream);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
