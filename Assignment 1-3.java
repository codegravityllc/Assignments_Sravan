import java.util.*;
	  public class SortArrList {
	
	  public static void main(String[] args) {
	  // Creae a list and add some colors to the list
	  List<String> list_Strings = new ArrayList<String>();
	  list_Strings.add("apple");
	  list_Strings.add("ball");
	  list_Strings.add("dog");
	  list_Strings.add("cat");
	  list_Strings.add("egg");
	  System.out.println("List before sort: "+list_Strings);
	  Collections.sort(list_Strings);
	  System.out.println("List after sort: "+list_Strings);    
	 }
	}

