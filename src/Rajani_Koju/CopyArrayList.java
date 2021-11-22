import java.util.ArrayList;
import java.util.Collections;

public class CopyArrayList {

	public static void main(String[] args) {
		ArrayList<String> number = new ArrayList<String>();
		number.add("three");
		number.add("two");
		number.add("five");
		number.add("one");
		number.add("four");
		
		ArrayList<String>fruits = new ArrayList<String>();
		fruits.add("apple");
		fruits.add("orange");
		fruits.add("kiwi");
		fruits.add("banana");
		fruits.add("grapes");
		
		Collections.copy(fruits, number);
		System.out.println(fruits);

	}

}
