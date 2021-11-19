package numbers;

import java.util.ArrayList;
import java.util.HashSet;

public class ConvertHashSetToArrayList9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 HashSet<String> Namelist = new HashSet<String>();
	     Namelist.add("Vijay");
	     Namelist.add("Ajith");
	     Namelist.add("Gopan");
	     Namelist.add("Martha");
	     System.out.println("Namelist in HashSet: "+ Namelist);
	 
	     ArrayList<String> Arraylist = new ArrayList<String>(Namelist);
	     System.out.println("Namelist in Array: "+ Arraylist);

	}

}
