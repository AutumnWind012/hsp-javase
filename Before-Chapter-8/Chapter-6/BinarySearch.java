import java.util.Scanner;

public class BinarySearch {

	// 二分查找
	static int biSearch(int[] arr, int key) {
		int n = arr.length;
		int low = 0, high = n - 1, mid;
		while (low <= high) {
			mid = (high + low) / 2;
			if (key == arr[mid]) return mid;
			else if (key > arr[mid]) low = mid + 1;
			else high = mid - 1;
		}
		return -1;
	}

	public static void main(String[] args) {

		int[] arr = {1,8,10,89,1000,1234};

		Scanner scanner = new Scanner(System.in);
		System.out.println("输入一个整数：");
		int num = scanner.nextInt();

		int ret = biSearch(arr, num);

		if (ret != -1){
			System.out.println("匹配成功，" + num + " 在数组中第 " + ret + " 个位置。");
		} else {
			System.out.println("sorry，没有找到");
		}
	}
}