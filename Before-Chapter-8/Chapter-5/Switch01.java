import java.util.Scanner;

public class Switch01 {
	public static void main(String[] args) {
		// 
		Scanner scanner = new Scanner(System.in);

		System.out.println("输入一个字符：");
		char day = scanner.next().charAt(0);

		switch (day) {
			case 'a':
				System.out.println("星期一");
				break;
			case 'b':
				System.out.println("星期二");
				break;
			case 'c':
				System.out.println("星期三");
				break;
			case 'd':
				System.out.println("星期四");
				break;
			case 'e':
				System.out.println("星期五");
				break;
			case 'f':
				System.out.println("星期六");
				break;
			case 'g':
				System.out.println("星期日");
				break;
			default:
				break;
		}
	}
}