package numbers;

import java.util.LinkedList;

public class RemoveAndReturnFirstElement13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	   LinkedList <String> BrandList = new LinkedList <String> ();
       BrandList.add("Audi");
       BrandList.add("Bmw");
       BrandList.add("Toyota");
       BrandList.add("Volkswagan");
       BrandList.add("Honda");
       System.out.println("Original BrandList: " + BrandList);
        
  System.out.println("Eleminated From BrandList: "+BrandList.pop());
  
  System.out.println("Final BrandList: "+BrandList);

	}

}
