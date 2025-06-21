import java.util.Scanner;

public class UserInput {
	public static void main(String[] args) {
		// 创建 Scanner 对象
		Scanner scanner = new Scanner(System.in);
		

		// 接收用户输入字符串
		System.out.println("请输入名字：");
		String name = scanner.next();

		// 接收用户输入 int
		System.out.println("请输入年龄");
		int age = scanner.nextInt();

		// 接收用户输入 double
		System.out.println("请输入薪水");
		double salary = scanner.nextDouble();

		System.out.println("名字：" + name + ", 年龄：" + age + "，薪水" + salary);

	}
}