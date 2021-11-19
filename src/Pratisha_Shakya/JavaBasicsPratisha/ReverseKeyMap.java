package JavaBasicsPratisha;

import java.util.Map;
import java.util.TreeMap;

public class ReverseKeyMap {

		public static void main(String[] args) {
			TreeMap<String,String> tree= new TreeMap<String,String>();
			tree.put("1","Red");
			tree.put("2", "Green");
			tree.put("3", "Orange");
			tree.put("4","Blue");
			
			System.out.println("Original list:"+tree);
			
			Map<String,String> key= tree.descendingMap();

			
			System.out.println("Reverse order:"+key);

}
}
