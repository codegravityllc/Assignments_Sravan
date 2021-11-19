package numbers;

import java.util.LinkedList;

public class RetriveFirstElement14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	  LinkedList <String> Variable = new LinkedList <String> ();
      Variable.add("1000");
      Variable.add("2000");
      Variable.add("3000");
      Variable.add("4000");
      Variable.add("5000");
      System.out.println("Original Variable List: " + Variable); 
 
      String a = Variable.peekFirst();
      System.out.println("First Variable : " + a);
      System.out.println("Original Variable list: " + Variable);   

	}

}
