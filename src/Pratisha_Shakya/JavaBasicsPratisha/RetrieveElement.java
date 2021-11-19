package JavaBasicsPratisha;

import java.util.LinkedList;

public class RetrieveElement {

	public static void main(String[] args) {

		LinkedList<String> link= new LinkedList<>();
		link.add("a");
		link.add("b");
		link.add("c");
		link.add("d");
		
		System.out.println("Original list:"+link);
		//Assignment 14- retrieve first element
		System.out.println("The first element of the list:"+link.getFirst());
		
		//Assignment 15- retrieve last element from linked list
		
		System.out.println("The last element of linkedlist:"+ link.getLast());

	}

}
