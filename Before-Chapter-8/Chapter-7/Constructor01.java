public class Constructor01 {
	public static void main(String[] args) {

		Dog dog = new Dog();
		
	}
}

class Person {
	String name;
	int age;

	public Person(String pName, int pAge) {
		System.out.println("构造器正在被调用");
		name = pName;
		age = pAge;
	}
}

class Dog {

	Dog(){}

	Dog(String pName) {

	}
}