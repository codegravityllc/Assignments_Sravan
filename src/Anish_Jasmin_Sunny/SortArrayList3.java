package numbers;

import java.util.ArrayList;
import java.util.Collections;

public class SortArrayList3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("Apple");
		arrayList.add("Banana");
		arrayList.add("Orange");
		arrayList.add("Lemon");
		arrayList.add("Mango");
		System.out.println("Before sorting : "+arrayList);
		Collections.sort(arrayList);
		System.out.println("After Sorting : "+arrayList);

	}

}
