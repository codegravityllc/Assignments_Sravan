
// Write a Java program to convert a hash set to an array
import java.util.HashSet;

public class HashsetToArray {

	public static void main(String[] args) {
		HashSet<Integer> hashSet = new HashSet<Integer>();
		hashSet.add(7);
		hashSet.add(90);
		hashSet.add(19);
		hashSet.add(8);
		System.out.println("Hashset :" +hashSet);
		
		//converting to array
		Integer num[] = new Integer[hashSet.size()];
		hashSet.toArray(num);
		for (Integer integer : num) {
			System.out.println("Hashset to Array : " +integer);
		}
		
		

	}

}
