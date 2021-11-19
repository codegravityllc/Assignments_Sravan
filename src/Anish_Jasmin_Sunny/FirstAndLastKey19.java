package numbers;

import java.util.TreeMap;

public class FirstAndLastKey19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 TreeMap <String,String> TrueValue = new TreeMap <String,String> (); 
		  TrueValue.put("A3", "3000");
		  TrueValue.put("A4", "2000");
		  TrueValue.put("A1", "5000");
		  TrueValue.put("A2", "4000");

		  System.out.println("content: " + TrueValue);
		  System.out.println("Greatest Value: " + TrueValue.firstEntry());
		  System.out.println("Least Value: " + TrueValue.lastEntry());

	}

}
