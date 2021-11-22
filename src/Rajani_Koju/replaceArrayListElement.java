import java.util.ArrayList;
import java.util.Collections;

// Write a Java program to replace the second element of a ArrayList with the 
 //specified element
public class replaceArrayListElement {

	public static void main(String[] args) {
		ArrayList<Integer> number = new ArrayList<Integer>();
		number.add(11);
		number.add(12);
		number.add(13);
		number.add(14);
		number.add(15);
		number.add(16);
		
		System.out.println("Before replacing: " +number);
		
		number.set(2, 50);
		System.out.println("After : " +number);
		
	}

}
