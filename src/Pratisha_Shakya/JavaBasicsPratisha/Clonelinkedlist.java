package JavaBasicsPratisha;

import java.util.LinkedList;

public class Clonelinkedlist {

	public static void main(String[] args) {

		LinkedList<String> list=new LinkedList<String>();
		list.add("a");
		list.add("b");
		list.add("C");
		
		System.out.println("Linkedlist:"+list);
		
		LinkedList<String> newList= new LinkedList<String>();
		newList=(LinkedList)list.clone();
		
		System.out.println("cloned linked List" + newList);
		
	}

}
