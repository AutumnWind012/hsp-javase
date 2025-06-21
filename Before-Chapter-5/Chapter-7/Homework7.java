public class Homework7 {
	public static void main(String[] args) {
		//
		Dog dog = new Dog("煤球", "白色", 2);

		dog.show();
	}
}


class Dog {

	String name;
	String color;
	int age;

	public Dog(String name, String color, int age) {
		this.name = name;
		this.color = color;
		this.age = age;
	}

	public void show() {
		System.out.println("狗狗名字：" + name + ", 颜色：" + color + "， 年龄：" + age);
	}
}


