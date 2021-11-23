import java.util.*;
	  public class Remthirdarrlist {
	
	  public static void main(String[] args) {
	  // Create a list and add some colors to the list
	  List<String> list_Strings = new ArrayList<String>();
	  list_Strings.add("Apple");
	  list_Strings.add("Ball");
	  list_Strings.add("cat");
	  list_Strings.add("dog");
	  list_Strings.add("elephant");
	  // Print the list
	  System.out.println(list_Strings);
	  // Remove the third element from the list.
	  list_Strings.remove(2);
	  // Print the list again
	  System.out.println("After removing third element from the list:\n"+list_Strings);
	 }
	}


