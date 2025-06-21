public class MethodExercise02 {

	public static void main(String[] args) {
		//
		Person p1 = new Person();
		p1.name = "Jack";
		p1.age = 23;

		MyTools tools = new MyTools();

		Person p2 = tools.copyPerson(p1);

		System.out.println(p2.name);
		System.out.println(p2.age);

		System.out.println(p1);
		System.out.println(p2);

	}

}

class Person {
	int age;
	String name;
}

class MyTools {
	public Person copyPerson(Person p) {
		Person temp = new Person();
		temp.name = p.name;
		temp.age = p.age;
		return temp;
	}
}