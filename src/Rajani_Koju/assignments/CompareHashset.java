package assignments;
//Write a Java program to compare two sets and retain elements which are same on both sets.
import java.util.HashSet;
import java.util.Set;

public class CompareHashset {

	public static void main(String[] args) {
		Set<Integer> hashSet = new HashSet<Integer>();
		hashSet.add(7);
		hashSet.add(90);
		hashSet.add(19);
		hashSet.add(8);
		System.out.println("Hashset :" +hashSet);
		
		Set<Integer> hashSet2 = new HashSet<Integer>();
		hashSet2.add(7);
		hashSet2.add(190);
		hashSet2.add(109);
		hashSet2.add(8);
		hashSet2.add(18);
		System.out.println("Hashset2 :" +hashSet2);
		
		hashSet.retainAll(hashSet2);
		System.out.println("Reatained element : " +hashSet);


	}

}
