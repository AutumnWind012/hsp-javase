import java.util.Scanner;

public class ArrayAdd {
	public static void main(String[] args) {
		// 原数组
		int[] arr = {1,2,3};
		do {
			// 创建临时数组用来扩容
			int[] arrNew = new int[arr.length + 1];
			// 拷贝原数组
			for (int i = 0; i < arr.length; ++i) {
				arrNew[i] = arr[i];
			}
			
			System.out.println("请添加一个整数：");
			Scanner scanner = new Scanner(System.in);
			
			// 添加接收的整数到扩容数组
			int addNum = scanner.nextInt();
			arrNew[arrNew.length - 1] = addNum;

			// 使 arr 指向扩容数组 (重要)
			arr = arrNew;

			// 打印
			System.out.println();
			for (int elem : arr) {
				System.out.print(elem + "\t");
			}

			System.out.println();
			System.out.println("添加成功！是否继续添加？(y/n)");
			char key = scanner.next().charAt(0);

			if (key == 'n') {
				break;
			}

		} while (true);
	}
}