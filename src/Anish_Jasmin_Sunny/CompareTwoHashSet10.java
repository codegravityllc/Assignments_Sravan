package numbers;

import java.util.HashSet;

public class CompareTwoHashSet10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        HashSet<Integer>HashSet1 = new HashSet<Integer>();
        HashSet1.add(10);
        HashSet1.add(20);
        HashSet1.add(30);
        HashSet1.add(40);
        HashSet1.add(50);
        System.out.println("HashSet1: " + HashSet1);
  
        HashSet<Integer>HashSet2 = new HashSet<Integer>();
        HashSet2.add(10);
        HashSet2.add(20);
        HashSet2.add(30);
        HashSet2.add(40);
        HashSet2.add(50);
        System.out.println("HashSet2: "+ HashSet2);
        boolean value = HashSet1.equals(HashSet2);
  
        System.out.println("Compare Both Sets: " + value);

	}

}
