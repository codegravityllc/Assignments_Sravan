package practice;

public class ComparisonOperators {

	public static void main(String[] args) {
		int a = 13;
		int b = 87;
		
		// == operator
		System.out.println("a==b : " +(a==b));
		
		// != operator
		System.out.println("a!b : " +(a!=b));
		
		// > operator
		System.out.println("a>b : " + (a>b));
		
		//<= operator
		System.out.println("a<=b : " + (a<=b));
		
		// Ternary Operators
		
		int c = (a>b)?100:200;
		System.out.println("c : " + c);

	}

}
