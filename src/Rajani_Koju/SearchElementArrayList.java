import java.util.ArrayList;
import java.util.Scanner;

public class SearchElementArrayList {

	public static void main(String[] args) {
		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("three");
		arrayList.add("two");
		arrayList.add("five");
		arrayList.add("one");
		arrayList.add("four");
		System.out.println(arrayList);
		
			
		boolean containFlag = arrayList.contains("six");
		if(containFlag==true) {
			System.out.println("Number is in list  " );
		}
		else {
			System.out.println("Number is not in list");
		}

	}

}
