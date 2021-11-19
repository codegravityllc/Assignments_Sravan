package numbers;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListShuffle5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ArrayList<String> Product = new ArrayList<String>();
		  
	        Product.add("AAAAA");
	        Product.add("BBBBB");
	        Product.add("CCCCC");
	        Product.add("DDDDD");
	        Product.add("EEEEE");
	        Product.add("FFFFF");
	  
	        System.out.println("Original Product List: ");
	 
	        java.util.Iterator<String> itr = Product.iterator();
	  
	        while (itr.hasNext()) {
	            System.out.print(itr.next() + " ");
	        }
	  
	        System.out.println("");
	  
	        Collections.shuffle(Product);
	  
	        System.out.println("Product List Shuffled:");
	  
	        itr = Product.iterator();
	  
	        while (itr.hasNext()) {
	            System.out.print(itr.next() + " ");
	        }
	}
}

	


