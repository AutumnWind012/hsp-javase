import java.util.Scanner;


public class Array02 {

	public static void main(String[] args) {
		// 
		double scores[] = new double[5];
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < scores.length; ++i) {
			System.out.println("输入第 " + (i+1) + " 位学生的成绩: ");
			scores[i] = scanner.nextDouble();
		}
		for (int i = 0; i < scores.length; ++i) {
			System.out.println("第 " + (i+1) + "位学生的成绩为：" + scores[i]);
		}
	}

}