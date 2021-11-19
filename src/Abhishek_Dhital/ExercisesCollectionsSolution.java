import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.TreeMap;
import java.util.TreeSet;

public class ExercisesCollectionsSolution 
{

	public static void main(String[] args) 
	{
		ArrayList<Integer> arr = new ArrayList<>();
		arr.add(30);
		arr.add(20);
		arr.add(18);
		arr.add(29);
		
		System.out.printf("The arraylist is: ");
		System.out.println(arr);
		
		removeThird(arr);
		System.out.printf("The arraylist after removing third element is: ");
		System.out.println(arr);
		
		System.out.println("************************************************");
		searchElement(arr, 40);
		
		System.out.println("************************************************");
		sortArrList(arr);
		System.out.printf("The arraylist after sorting: ");
		System.out.println(arr);
		
		System.out.println("************************************************");
		ArrayList<Integer> arr2 = copyArrList(arr);
		System.out.println("After Copying to new arraylist *arr2*...\narr2: " + arr2);
		
		System.out.println("************************************************");
		shuffle(arr);
		System.out.println("After shuffling arr...\narr: " + arr);
		
		System.out.println("************************************************");
		replace(arr, 33);
		System.out.println("After replacing the second element with 33...\narr: "+arr);
		
		System.out.println("************************************************");
		HashSet<Integer> hash = new HashSet<Integer>();
		hash.add(11);
		hash.add(22);
		hash.add(44);
		System.out.println("The newly created hashset: " + hash);
		
		Object [] a = hashToArray(hash);
		System.out.printf("The array converted from HashSet contains the following elements: ");
		for (int i = 0; i < a.length; i++)
			System.out.printf(a[i] + ",");
		System.out.printf("\n");
		
		System.out.println("************************************************");
		TreeSet<Integer> tree = hashToTree(hash);
		System.out.println("The hashset after being converted to treeset: " + tree);
	
		System.out.println("************************************************");
		ArrayList<Integer> arrConverted = hashToArrayList(hash);
		System.out.println("The new arraylist converted from hashset is: " + arrConverted);
		
		HashSet<Integer> hash2 = new HashSet<Integer>(hash);
		hash2.add(99);
		hash2.add(113);
		compareHashSet(hash, hash2);

		System.out.println("************************************************");
		retainSameElements(hash,hash2);
		
		System.out.println("************************************************");
		//Creating linked list 1
		LinkedList<Integer> list1 = new LinkedList<Integer>();
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);
		System.out.println("The linked list #1 is: " + list1);
		LinkedList<Integer> list2 = cloneList(list1);
		System.out.println("The linked list created by cloning linked list #1 is: " + list2);
		
		System.out.println("************************************************");
		int removed = removeHead(list1);
		System.out.println("The list after the head is removed: " + list1);
		System.out.println("The first element that was removed from the list is: " + removed);
		
		System.out.println("************************************************");
		int firstElement = returnHead(list1);
		System.out.println("Returning the first element without removing it from the list: " + firstElement);
		System.out.println("The list looks as follows: " + list1);
		
		System.out.println("************************************************");
		int lastElement = returnLast(list1);
		System.out.println("Returning the last element without removing it from the list: " + lastElement);
		
		System.out.println("************************************************");
		TreeMap<Integer, String> tMap = new TreeMap<Integer, String>();
		tMap.put(18, "Fernandes");
		tMap.put(10, "Rashford");
		tMap.put(9, "Martial");
		tMap.put(11, "Greenwood");
		System.out.println("The tree map before removal of all its elements: " + tMap);
		deleteTree(tMap);
		System.out.println("The tree map after removal of all its elements: " + tMap);
	}

//	1. Write a Java program to remove the third element from a array list. 
	public static void removeThird(ArrayList<Integer> arrList)
	{
		arrList.remove(2);
	}
	
//	2. Write a Java program to search an element in a array list. 
	
	public static void searchElement(ArrayList<Integer> arrList, int element)
	{
		System.out.printf("Searching for element %d in the arraylist....\n", element);
		if (arrList.indexOf(element) == -1)
		{
			System.out.printf("The element %d doesn't exist in the arraylist.\n", element);
			return;
		}
		
		System.out.printf("The element %d exists and its index is: \n" + arrList.indexOf(element), element);		
	}


//	3. Write a Java program to sort a given array list. 
	public static void sortArrList(ArrayList<Integer> arrList)
	{
		Collections.sort(arrList);
	}
	
	
//		4. Write a Java program to copy one array list into another. 
	public static ArrayList<Integer> copyArrList(ArrayList<Integer> arrList)
	{
		ArrayList<Integer> arrList2 = (ArrayList<Integer>)arrList.clone();
		return arrList2;
	}

//		5. Write a Java program to shuffle elements in a array list
	public static void shuffle(ArrayList<Integer> arrList)
	{
		Collections.shuffle(arrList);
	}

//		6.Write a Java program to replace the second element of a ArrayList with the specified element
	public static void replace(ArrayList<Integer> arrList, int element)
	{
		arrList.set(1, element);
		
	}

//	7. Write a Java program to convert a hash set to an array. 
	public static Object[] hashToArray(HashSet<Integer> h)
	{
		Object [] array = h.toArray();
		return array;
	}

//	8. Write a Java program to convert a hash set to a tree set.
	public static TreeSet<Integer> hashToTree(HashSet<Integer> h)
	{
		return new TreeSet<>(h);		
	}

//	9. Write a Java program to convert a hash set to a List/ArrayList. 
	public static ArrayList<Integer> hashToArrayList(HashSet<Integer> h)
	{
		return new ArrayList<Integer>(h);
	}
	
//	10. Write a Java program to compare two hash set. 
	public static void compareHashSet(HashSet<Integer> h1, HashSet<Integer> h2)
	{
		System.out.println("***************Comparing HashSets*************\nhashSet1: " + h1 + "\nhashSet2: " + h2);
		boolean compare = h1.equals(h2);
		String returnMsg = compare ? "The given hashsets are equal." : "The given hashsets are not equal.";
		System.out.println(returnMsg);
	}
	
//	11. Write a Java program to compare two sets and retain elements which are same on both sets.
	public static void retainSameElements(HashSet<Integer> h1, HashSet<Integer> h2)
	{
		System.out.println("Set #2 before retention of only those elements which are common with set #1: " + h2);
		h2.retainAll(h1);
		System.out.println("Set #2 after retention of only those elements which are common with set #1: " + h2);
	}
	
//	12. Write a Java program to clone an linked list to another linked list. 
	public static LinkedList<Integer> cloneList(LinkedList<Integer> list)
	{
		return (LinkedList<Integer>) list.clone();
	}
	
//	13. Write a Java program to remove and return the first element of a linked list.
	public static int removeHead(LinkedList<Integer> list)
	{
		return list.remove();
	}
	
//	14. Write a Java program to retrieve but does not remove, the first element of a linked list. 
	public static int returnHead(LinkedList<Integer> list)
	{
		return list.getFirst();
	}
	
//	15. Write a Java program to retrieve but does not remove, the last element of a linked list.
	public static int returnLast(LinkedList<Integer> list)
	{
		return list.getLast();
	}
	
// 16. Write a Java program to delete all elements from a given Tree Map. 
	public static void deleteTree(TreeMap<Integer, String> tree)
	{
		tree.clear();
	}

//	17. Write a Java program to sort keys in Tree Map by using comparator. 
	
}
