import java.util.Scanner;

public class If03 {
	public static void main(String[] args) {
		// 创建 Scanner 对象
		Scanner scanner = new Scanner(System.in);

		// 接收用户输入 int
		System.out.println("请输入信用分：");
		int creditScore = scanner.nextInt();

		if (creditScore == 100) {
			System.out.println("信用极好");
		} else if (creditScore <= 99 && creditScore > 80) {
			System.out.println("信用优秀");
		} else if (creditScore <= 80 && creditScore >= 60) {
			System.out.println("信用一般");
		} else {
			System.out.println("信用不合格");
		}
	}
}