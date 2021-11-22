package assignments;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

//Write a Java program to convert a hash set to a List/ArrayList.
public class HashsetToArrayList {

	public static void main(String[] args) {
		Set<Integer> hashSet = new HashSet<Integer>();
		hashSet.add(7);
		hashSet.add(90);
		hashSet.add(19);
		hashSet.add(8);
		System.out.println("Hashset :" +hashSet);
		
		ArrayList<Integer> arraySet = new ArrayList<>(hashSet);
		System.out.println("ArrayList :" +arraySet);

	}

}
