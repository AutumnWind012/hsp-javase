public class Object01 {
	public static void main(String[] args) {
		// 第一只猫信息

		// 使用 OOP 创建猫的实例
		Cat cat2 = new Cat();
		cat2.name = "小花"
		cat2.age = 100;
		cat2.color = "花色";
	}
}

// 使用面向对象的方式来解决养猫问题

// 定义一个猫类，Cat -> 自定义的数据类型
class Cat {

	// 属性
	String name;
	int age;
	String color;
}