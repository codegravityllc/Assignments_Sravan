package numbers;

import java.util.HashSet;

public class CompareTwoSetsAndRetain11 {

	   public static void main(String[] args) {
		    // TODO Auto-generated method stub
		    HashSet<String> Set1 = new HashSet<String>();
	        Set1.add("Red");
	        Set1.add("Green");
	        Set1.add("Yellow");
	        Set1.add("Orange");
	        Set1.add("Black");
	        System.out.println("Set1 Contains : "+Set1);
	        HashSet<String> Set2 = new HashSet<String>();
	        Set2.add("Black");
	        Set2.add("Orange");
	        Set2.add("Yellow");
	        Set2.add("White");
	        Set2.add("Gray");
	        System.out.println("Set2 Contains : "+Set2);
	        Set1.retainAll(Set2);
	        System.out.println("Common Colors In Both Sets : "+Set1);

	}

}
