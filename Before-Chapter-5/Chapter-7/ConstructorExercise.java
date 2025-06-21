public class ConstructorExercise {
	public static void main(String[] args) {
		//
		Person p1 = new Person();
		System.out.println("age of p1 = " + p1.age);
		System.out.println("name of p1 = " + p1.name);

		Person p2 = new Person("Tom", 9);
		System.out.println("age of p2 = " + p2.age);
		System.out.println("name of p2 = " + p2.name);
	}
}

class Person {
	int age;
	String name;

	Person() {
		System.out.println("调用无参构造器~~");
		age = 18;
	}

	Person(String pName, int pAge) {
		System.out.println("调用有参构造器~~");
		name = pName;
		age = pAge;
	}
}