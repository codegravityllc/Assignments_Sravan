package numbers;

import java.util.TreeMap;

public class KeyValueMapping18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  TreeMap <String,String> TreeValue = new TreeMap <String,String> (); 
		  TreeValue.put("A1", "5000");
		  TreeValue.put("A2", "4000");
		  TreeValue.put("A3", "3000");
		  TreeValue.put("A4", "2000");

		  System.out.println("content: " + TreeValue);
		  System.out.println("Greatest Value: " + TreeValue.firstEntry());
		  System.out.println("Least Value: " + TreeValue.lastEntry());


	}

}
