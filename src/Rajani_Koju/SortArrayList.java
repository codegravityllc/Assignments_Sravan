import java.util.ArrayList;
import java.util.Collections;

public class SortArrayList {

	public static void main(String[] args) {
		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("three");
		arrayList.add("two");
		arrayList.add("five");
		arrayList.add("one");
		arrayList.add("four");
		System.out.println("Before sorting :" +arrayList);
		
		Collections.sort(arrayList);
		System.out.println("After sorting : " +arrayList);

	}

}
