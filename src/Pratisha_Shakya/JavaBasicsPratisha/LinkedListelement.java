package JavaBasicsPratisha;

import java.util.LinkedList;

public class LinkedListelement{

	public static void main(String[] args) {
		
	

		LinkedList<String> list= new LinkedList<>();
		list.add("Apple");
		list.add("Red");
		list.add("Blue");
		list.add("Green");
		
		System.out.println("The orginial list:"+list);
		list.removeFirst();
		
		System.out.println("Final liist:"+list);
	}
}



