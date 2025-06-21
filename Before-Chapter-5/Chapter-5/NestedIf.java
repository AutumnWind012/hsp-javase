import java.util.Scanner;

public class NestedIf {

	static void test01() {
		Scanner scanner = new Scanner(System.in);

		System.out.println("请输入歌手的分数：");
		double score = scanner.nextDouble();
		char gender;

		if (score > 8.0) {
			// .next() 先接收字符串, .charAt(0) 接收字符串中的第一个字符
			System.out.println("请输入性别：");
			gender = scanner.next().charAt(0);
			if ( gender == 'M') {
				System.out.println("恭喜你进入男子组");
			} else if (gender == 'F') {
				System.out.println("恭喜你进入女子组");
			} else {
				System.out.println("恭喜你进入其他组");
			}

		} else {
			System.out.println("很遗憾，你被淘汰了");
		}

	}

	static void test02() {

		Scanner scanner = new Scanner(System.in);

		System.out.println("请输入月份：");
		int month = scanner.nextInt();

		if (month > 12 || month < 1) {
			System.out.println("月份有误");
			return;
		}

		System.out.println("请输入年龄：");
		int age = scanner.nextInt();

		boolean isHotSeason;
		if (month >= 4 && month <= 10) {
			isHotSeason = true;

		} else {
			isHotSeason = false;
		}

		if (age > 60) {
			System.out.println("老人，票价为 20 元");
		} else if (age <= 60 && age >= 18) {
			if (isHotSeason) {
				System.out.println("成人，票价为 60 元");
			} else {
				System.out.println("成人，票价为 40 元");
			}
		} else {
			if (isHotSeason) {
				System.out.println("儿童，票价为 30 元");
			} else {
				System.out.println("儿童，票价为 20 元");
			}
		}
	}

	public static void main(String[] args) {

		test02();

	}
}