package numbers;

import java.util.TreeMap;

public class DeleteAllElements16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	  TreeMap<String,String> TreeMap = new TreeMap<String,String>();      
	  TreeMap.put("Player1", "Sachin");
	  TreeMap.put("Player2", "Dhoni");
	  TreeMap.put("Player3", "Singh");
	  TreeMap.put("Player4", "Tinu"); 
	    
	  System.out.println("Players List: "+TreeMap);
	  TreeMap.clear();
	  System.out.println("New Players List: "+TreeMap);

	}

}
