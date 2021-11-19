package numbers;

import java.util.LinkedList;

public class CloneLinkedListToAnother12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		    LinkedList<String> list = new LinkedList<String>();
	        list.add("10");
	        list.add("20");
	        list.add("30");
	        list.add("40");
	        list.add("50");
	        System.out.println("List A: "+ list);
	      
	        LinkedList<String>list2 = new LinkedList<String>();
	        LinkedList<String> clone1 = list;
			list2 = clone1;
	
	        System.out.println("List B: "+ list2);

	}

}
