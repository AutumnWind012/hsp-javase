public class this01 {
	public static void main(String[] args) {
		//
		Person p = new Person("jack", 23);
		p.info();
	}
}



class Person {
	String name;
	int age;
	// 构造器
	public Person(String name, int age) {
		System.out.println("构造器正在被调用~~");
		name = name;
		age = age;
	}
	// 第二个构造器（重载）
	public void info() {
		System.out.println(name + "\t" + age + "\t");
	}
}