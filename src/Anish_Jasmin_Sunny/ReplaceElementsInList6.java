package numbers;

import java.util.ArrayList;

public class ReplaceElementsInList6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String>  Brand = new ArrayList<String>();

		  Brand.add("Audi");
		  Brand.add("Honda");

		  System.out.println("Original Brand: " + Brand);
		  String new_Brand = "Tesla";
		  Brand.set(1,new_Brand);

		  int num=Brand.size();
		  System.out.println("Replace second Brand with 'Tesla'."); 
		  for(int i=0;i<num;i++)
		  System.out.println(Brand.get(i));
		

	}

}
