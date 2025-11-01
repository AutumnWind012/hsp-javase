import java.util.Scanner;

public class If01 {
	public static void main(String[] args) {
		// 创建 Scanner 对象
		Scanner scanner = new Scanner(System.in);

		// 接收用户输入 int
		System.out.println("请输入年龄");
		int age = scanner.nextInt();
		
		if (age > 18) {
			System.out.println("年龄大于 18，送入监狱");
		}
		System.out.println("程序继续...");
	}
}