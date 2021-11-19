package numbers;


import java.util.HashSet;

public class HashsettoArrayList7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> set = new HashSet<String>();
        set.add("100");
        set.add("200");
        set.add("300");
        set.add("400");
        set.add("500");
  
        System.out.println("Hash Set:" + set);
        String arr[] = new String[set.size()];
        
        set.toArray(arr);
  
        for (String n : arr)
            System.out.println(n);

	}

}
