import java.util.ArrayList;

public class RemoveThirdElement {

	public static void main(String[] args) {
		ArrayList<String>arrayList = new ArrayList<String>();
		arrayList.add("apple");
		arrayList.add("orange");
		arrayList.add("kiwi");
		arrayList.add("banana");
		arrayList.add("grapes");
		
		System.out.println("size of arrayList :" +arrayList.size());

        System.out.println(arrayList);
        
		arrayList.remove(3);
		System.out.println("list after removing third elemnt :" +arrayList);
		
		arrayList.set(2, "mango");
		System.out.println("arrayList after set :" +arrayList);
		
		
		
		
		

	}

}
