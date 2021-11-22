package constructor;

public class ConstructorDemo {

	public static void main(String[] args) {
		Person person = new Person();
		System.out.println(person.getName());
		Person person2 = new Person("riya", 11);
		System.out.println(person2.getAge());

	}

}

class Person{
	String name;
	int age;
	public Person() {
		System.out.println("person constructor");
		name = "jiya";
	
	}
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	
}