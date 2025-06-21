import java.util.Scanner;

public class practice03 {

	public static void main(String[] args){

		double sum = 0;
		double totalSum = sum;
		double score = 0;
		int count = 0;

		Scanner scanner = new Scanner(System.in);

		for (int i = 1; i <= 3; ++i) {
			for (int j = 1; j <= 5; ++j) {
				System.out.println("请输入第 " + i +  " 个班的第 " + j + " 个学生的成绩");
				score = scanner.nextDouble();
				if (score >= 60) ++count;
				sum += score;
			}
			System.out.println("第" + i + "个班的平均成绩：" + sum/5);
			totalSum += sum;
			sum = 0;
		}

		System.out.println("所有班的平均成绩：" + totalSum/15);
		System.out.println("通过人数：" + count);
	}

}