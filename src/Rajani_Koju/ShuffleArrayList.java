
//Write a Java program to shuffle elements in a array list
import java.util.ArrayList;
import java.util.Collections;

public class ShuffleArrayList {

	public static void main(String[] args) {
		ArrayList<Integer> number = new ArrayList<Integer>();
		number.add(11);
		number.add(12);
		number.add(13);
		number.add(14);
		number.add(15);
		number.add(16);
		
		System.out.println("Before shuffle: " +number);
		
		Collections.shuffle(number);
		System.out.println("After shuffle: " +number);

	}

}
