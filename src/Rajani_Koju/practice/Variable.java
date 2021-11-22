package practice;

public class Variable {
	
	public static String staticVar = "this is from static variable";
	
	public String instanceVar = "this is from instance variable";
	
	public void localvar() {
		String localVariable = "this is from local variable";
		System.out.println(localVariable);
	}

	public static void main(String[] args) {
		
		//static variable can call directly without creating object
		System.out.println(Variable.staticVar);
		
		Variable variable = new Variable();
		//ststic variable can be called through creating object but it's not a static way
		System.out.println(variable.staticVar);
		
		//instance variable can be access by creating object of the class
		System.out.println(variable.instanceVar);
		//local variable 
		variable.localvar();



	}

}
