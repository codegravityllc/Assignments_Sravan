package practice;

public class LoopDemo {

	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) { // prints value of i {0,1,2,3,4}
			System.out.println("valur of i : " + i);
		}

		for (int i = 1; i < 6; i++) {
			System.out.println(i);
			if (i == 2) {
				break; // it stops to print the value when the if condition matches
			}
		}

		for (int i = 1; i < 6; i++) {

			if (i == 2) {
				continue; // it skips the if condition matching value
			}
			System.out.println(i);
           
		}
		 System.out.println("==========================");
  // while loop
		int i = 1;
		while(i<5) {
			System.out.println(i);
			i++;
		}
	}
}
