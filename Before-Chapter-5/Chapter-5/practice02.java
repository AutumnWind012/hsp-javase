import java.util.Scanner;

public class practice02 {

	static void q1() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("输入一个字符: ");
		char c = scanner.next().charAt(0);

		switch (c) {
			case 'a':
				System.out.println("A");
				break;
			case 'b':
				System.out.println("B");
				break;
			case 'c':
				System.out.println("C");
				break;
			case 'd':
				System.out.println("D");
				break;
			case 'e':
				System.out.println("E");
				break;
			default:
				System.out.println("Other");
				break;
		}
	}

	static void q2() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("输入学生成绩: ");
		int score = scanner.nextInt();

		switch(score/60) {
			case 1:
				System.out.println("合格");
				break;
			case 0:
				System.out.println("不合格");
				break;
			default:
				System.out.println("输入有误，成绩无效");
				break;
		}

	}

	static void q3(){
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("输入月份: ");
		int month = scanner.nextInt();

		if (month > 12 || month < 1) {
			System.out.println("不存在的月份");
			return;
		}

		switch(month/3) {
			case 1:
				System.out.println("春季");
				break;
			case 2:
				System.out.println("夏季");
				break;
			case 3:
				System.out.println("秋季");
				break;
			default:
				System.out.println("冬季");
				break;
		}	
	}

	public static void main(String[] args) {
		q3();	
	}
}