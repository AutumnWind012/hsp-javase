public class MethodParameters02 {
	public static void main(String[] args) {
		//
		Person p = new Person();
		p.age = 23;
		p.name = "jack";

		B b = new B();

		b.test(p);

		System.out.println("main 方法的 p.age = " + p.age);
	}
}


class Person {
	String name;
	int age;
}


class B {
	public void test(Person p) {
		 p.age = 123;
	}
}