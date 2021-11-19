package excercise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.TreeMap;
import java.util.TreeSet;

public class Excercise {
	public static void main(String[] args) { 
		ArrayList<Integer> arr = new ArrayList<>();
		arr.add(0);
		arr.add(1);
		arr.add(2);
		arr.add(4);
		arr.add(3);
		System.out.println("arraylist is "+ arr);
                removethirdel(arr);
                System.out.println("after 3rd element removal: "+ arr);
                searchforel(arr,4);
                sortAL(arr);
                System.out.println("After sorting: "+ arr);
                ArrayList<Integer> copy_arr = copyAL(arr);
                System.out.println("Copied arraylist: "+copy_arr);
                shuffleAL(arr);
                System.out.println("After shuffle: "+ arr);
                replacesec(arr,9);
                System.out.println("Replaced second element to 9, output is: "+ arr);
                HashSet<Integer> h = new HashSet<>();
		h.add(1);
		h.add(99);
		h.add(67);
		System.out.println("Hashset created: " + h);
                Object[] array = h2A(h);
                System.out.printf("Array from hash set: \n[");
                int i = 0;
                for (i = 0; i < array.length; i++)
                    if(i < (array.length -1))System.out.printf(array[i] + ",");
                    else System.out.printf(array[i] + "]\n");
                TreeSet <Integer> tree = h2T(h);
                System.out.println("Tree from hash: "+ tree);
                ArrayList <Integer> arr2 = h2AL(h);
                System.out.println("New ArrayLost from hashSet: "+ arr2);
                HashSet<Integer> h2 = new HashSet<>();
		h2.add(1);
		h2.add(66);
		h2.add(99);
                System.out.println("Comparing above hash set to: "+ h2);
                compareHS(h,h2);
                SameELs(h,h2);
                LinkedList<Integer> ll1 = new LinkedList<>();
                ll1.add(1);
                ll1.add(0);
                ll1.add(526);
                ll1.add(6);
                System.out.println("New Linked list created: "+ ll1);
                LinkedList<Integer> ll2 = copyLL(ll1);
                System.out.println("Copied to this linked list: "+ ll2);
                int head = removefirstLL(ll1);
                System.out.printf("Removed 1st element %d from first linked list\n",head);
                System.out.println("New linked list: "+ll1);
                head = retrievefirstLL(ll1);
                System.out.printf("Retrieved 1st element %d from first linked list\n",head);
                System.out.println("Linked list: "+ll1);
                head = retrievelastLL(ll1);
                System.out.printf("Retrieved last element %d from first linked list\n",head);
                System.out.println("Linked list: "+ll1);
                
	}

//	1. Write a Java program to remove the third element from a array list. 
        static void removethirdel(ArrayList<Integer> in)
        {
            in.remove(2); //2 holds the third element.
        }
        
//	2. Write a Java program to search an element in a array list.
        static void searchforel(ArrayList<Integer> in, int num)
        {
            int out = in.indexOf(num);
            if (out == -1) System.out.println("No such element found");
            else System.out.printf("Found at index %d value of %d\n",out,num);
        }
       
//	3. Write a Java program to sort a given array list. 
        static void sortAL(ArrayList<Integer> in)
        {
            Collections.sort(in);
        }

//	4. Write a Java program to copy one array list into another.
        static ArrayList<Integer> copyAL(ArrayList<Integer> from)
        {
            ArrayList<Integer> to = (ArrayList<Integer>)from.clone();
            return to;
        }
//	5. Write a Java program to shuffle elements in a array list
        static void shuffleAL(ArrayList<Integer> in)
        {
            Collections.shuffle(in);
        }
//	6.Write a Java program to replace the second element of a ArrayList with the specified element
        static void replacesec(ArrayList<Integer> in, int num)
        {
            in.set(1,num);
        }
//	7. Write a Java program to convert a hash set to an array. 
        static Object[] h2A(HashSet<Integer> h)
	{
		Object [] arr = h.toArray();
		return arr;
	}
//	8. Write a Java program to convert a hash set to a tree set.
	static TreeSet<Integer> h2T(HashSet<Integer> h)
	{
		return new TreeSet<>(h);		
	}   
//	9. Write a Java program to convert a hash set to a List/ArrayList. 
	static ArrayList<Integer> h2AL(HashSet<Integer> h)
	{
		return new ArrayList<Integer>(h);
	}
//	10. Write a Java program to compare two hash set. 
	static void compareHS(HashSet<Integer> h1, HashSet<Integer> h2)
	{
		boolean out = h1.equals(h2);
		if(out) System.out.println("Equal hash sets");
                else System.out.println("Unequal hash sets");
	}
//	11. Write a Java program to compare two sets and retain elements which are same on both sets.
	static void SameELs(HashSet<Integer> h1, HashSet<Integer> h2)
	{
		h2.retainAll(h1);
		System.out.println("All common elements in hashSets are: " + h2);
	}	
//	12. Write a Java program to clone an linked list to another linked list. 
	static LinkedList<Integer> copyLL(LinkedList<Integer> in)
	{
		return (LinkedList<Integer>) in.clone();
	}
	
//	13. Write a Java program to remove and return the first element of a linked list.
	static int removefirstLL(LinkedList<Integer> in)
	{
		return in.remove();
	}
	
//	14. Write a Java program to retrieve but does not remove, the first element of a linked list. 
	static int retrievefirstLL(LinkedList<Integer> in)
	{
		return in.getFirst();
	}
	
//	15. Write a Java program to retrieve but does not remove, the last element of a linked list.
	static int retrievelastLL(LinkedList<Integer> in)
	{
		return in.getLast();
	}
}	


 



