package numbers;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class ConvertHashsettoTreeSet8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Set<String> Hashset = new HashSet<>();
	        Hashset.add("10");
	        Hashset.add("20");
	        Hashset.add("30");
	        Hashset.add("40");
	        Hashset.add("50");
	  
	        System.out.println("HashSet: "+ Hashset);
	  
	        
	        Set<String> hashSetToTreeSet = new TreeSet<>(Hashset);
	  
	       
	        System.out.println("TreeSet: "  + hashSetToTreeSet);

	}

}
