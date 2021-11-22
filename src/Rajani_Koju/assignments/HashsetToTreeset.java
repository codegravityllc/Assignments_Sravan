package assignments;
// Write a Java program to convert a hash set to a tree set.
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashsetToTreeset {

	public static void main(String[] args) {
		Set<Integer> hashSet = new HashSet<Integer>();
		hashSet.add(7);
		hashSet.add(90);
		hashSet.add(19);
		hashSet.add(8);
		System.out.println("Hashset :" +hashSet);
		
		//converting to treeset
		
		Set<Integer> hashSetToTreeSet = new TreeSet<>(hashSet);
		System.out.println("Treeset :" +hashSetToTreeSet);

	}

}
