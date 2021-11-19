package numbers;

import java.util.ArrayList;

public class ArrayListDemo1{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("Apple");
		arrayList.add("Banana");
		arrayList.add("Orange");
		arrayList.add("Lemon");
		arrayList.add("Mango");
		System.out.println("Products in the List: "+arrayList); 
		arrayList.remove("Orange");  
		System.out.println("Updated Product List : "+arrayList);
		

	}

}
