package JavaBasicsPratisha;

import java.util.HashSet;

public class RetainsameElements {

	public static void main(String[] args) {
	
		HashSet<String> hash= new HashSet<String>();
		hash.add("Apple");
		hash.add("Ball");
		hash.add("Grey");
		System.out.println("First list:"+hash);
		
		HashSet<String> hash1= new HashSet<String>();
		hash1.add("Grey");
		hash1.add("Red");
		hash1.add("five");
		System.out.println("Second list:"+hash1);
		hash.retainAll(hash1);
		System.out.println("Same Elements in both sets:"+hash);

	}

}
