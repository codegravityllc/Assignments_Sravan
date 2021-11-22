package assignments;

import java.util.LinkedList;

public class RetrieveLinkedList {

	public static void main(String[] args) {
		LinkedList<String> list1 = new LinkedList<String>();
		list1.add("white");
		list1.add("snow");
		list1.add("blue");
		list1.add("sky");
		System.out.println("LinkedList1 : " +list1);
		
		list1.remove(1);
		list1.remove("sky");
		
		System.out.println("LinkedList2 : " +list1);

	}

}
