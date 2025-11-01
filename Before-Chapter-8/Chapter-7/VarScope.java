public class VarScope {

	public static void main(String[] args) {
		//
		Person p1 = new Person();

		p1.test();
	}
}



class Person {
	String name = "jack";


	public void test() {
		String name = "david";
		String name = "helena";
		System.out.println("f() name = " + name);
	}
}



class Cat {

	// 全局变量
	int age = 3;

	// 提供默认值
	double weight;

	public void makeSound() {
		String sound;
		// 必须赋值才能使用
		System.out.println(sound);
	}
}