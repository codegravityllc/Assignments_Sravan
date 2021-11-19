package JavaBasicsPratisha;

import java.util.TreeMap;

public class Assignment16 {

		public static void main(String[] args) {
			TreeMap<String,String> tree= new TreeMap<String,String>();
			tree.put("1","Red");
			tree.put("2", "Green");
			tree.put("3", "Orange");
			tree.put("4","Blue");
		System.out.println("Orginal list:"+tree);
		// delete all elements Assignment 16
		tree.clear();
		System.out.println("Deleted list:"+ tree);
		
		
	}

}
