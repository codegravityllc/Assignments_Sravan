package assignments;
// Write a Java program to clone an linked list to another linked list.
import java.util.LinkedList;
import java.util.List;

public class LinkedListClone {

	public static void main(String[] args) {
		
		LinkedList<String> list1 = new LinkedList<String>();
		list1.add("white");
		list1.add("snow");
		list1.add("blue");
		list1.add("sky");
		System.out.println("LinkedList1 : " +list1);
		// clone of linkedlist
		LinkedList list2 = new LinkedList();
		list2 = (LinkedList) list1.clone();
		
		System.out.println("LinkedList2 : " +list2);
		
		//remove first element of linkedlist
		
		System.out.println("Removing first element :" + list1.removeFirst());
		System.out.println("After removing : " +list1);

	}

}
