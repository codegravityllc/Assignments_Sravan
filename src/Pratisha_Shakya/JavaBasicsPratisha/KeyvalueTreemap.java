package JavaBasicsPratisha;

import java.util.TreeMap;

public class KeyvalueTreemap {

	public static void main(String[] args) {
		TreeMap<String,String> tree= new TreeMap<String,String>();
		tree.put("1","Red");
		tree.put("2", "Green");
		tree.put("3", "Orange");
		tree.put("4","Blue");
		// Assignment 18 least key value and greatest key value
		System.out.println("Original list:"+ tree);
		//get the key value for least key
		System.out.println("Least key:"+tree.firstEntry());
		//get key value for greatest
		System.out.println("Greatest key:"+ tree.lastEntry());
		
		//Assignment 19- get first lowestkey and last highest key
		
		//retrieve first lowest key
		System.out.println("First Lowest key"+ tree.firstKey());
		//retrieve last highest key
		System.out.println("Last highest key:"+ tree.lastKey());
		
	}

}
