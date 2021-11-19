package numbers;

import java.util.ArrayList;

public class SearchElementsInArrayList2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("Apple");
		arrayList.add("Banana");
		arrayList.add("Orange");
		arrayList.add("Lemon");
		arrayList.add("Mango");
		boolean flag = arrayList.contains("peach");
	    System.out.println("Search Result : " + flag);
	  

	}

}
