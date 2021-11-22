package practice;

public class Operators {
	static int a = 12;
	static int b = 14;
	static int c;

	public static void main(String[] args) {
		//Basic arithmetic operators +, -, *, /, %
		c =a+b;
		System.out.println("sum of a&b : "+Operators.c);
		
		//Assignment operators =, +=, -=,*=, /=, %=
		a+=b;
		System.out.println("a : " +Operators.a);
		System.out.println("b : " +Operators.b);
		
		a=+b;
		System.out.println("a : " +Operators.a);
		System.out.println("b : " +Operators.b);
		//Auto increment operator // auto decrement operator a--
		++a;
		System.out.println("a : " +Operators.a);

	}

}
