package practice;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Choose the number");
		
		int option = scan.nextInt();
		String color = null;
		switch(option){
		case 1:
			color = "Red";
			break;
			
		case 2:
			color = "Green";
			//break;
		case 3:
			color = "Blue";
			break;
			
		default:
			System.out.println("not match");
			
			
		}
		System.out.println(color);

	}

}
