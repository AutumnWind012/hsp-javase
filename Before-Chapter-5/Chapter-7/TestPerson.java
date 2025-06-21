public class TestPerson {
	public static void main(String[] args) {
		//
		Person p1 = new Person("smith", 18);
		Person p2 = new Person("david", 23);
		Person p3 = new Person("smith", 18);

		System.out.println(p1.compareTo(p2));	// false

		System.out.println(p1.compareTo(p3));	// true

	}
}

class Person {
	String name;
	int age;
	// 有参构造器
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	// 提供 compareTo 方法判断对象的属性是否相等
	public boolean compareTo(Person p) {
		return this.name.equals(p.name) && this.age == p.age;
	}
}