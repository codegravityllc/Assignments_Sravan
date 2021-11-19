package numbers;

import java.util.ArrayList;
import java.util.Collections;

public class Copylist4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ArrayList<String> Product = new ArrayList<String>();
	      Product.add("Mobile");
	      Product.add("Tv");
	      Product.add("IPad");
	      
	      ArrayList<String> Brand = new ArrayList<String>();
	      Brand.add("Motorola");
	      Brand.add("Samsung");
	      Brand.add("Apple");
	      
	      Collections.copy(Brand,Product);
	      System.out.println(Brand);

	}

}
