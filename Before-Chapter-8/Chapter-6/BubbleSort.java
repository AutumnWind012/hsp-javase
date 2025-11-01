public class BubbleSort {
	public static void main(String[] args) {
		// 待排序序列
		int[] arr = {24,69,80,57,13,17,69,42};
		boolean swapped = false;
		int n = arr.length;

		// 一共处理 n-1 次
		for (int i = 0; i < n - 1; ++i) {
			// 从海底出发，每次将最小的元素“冒”到水面
			for (int j = n - 1; j > i; --j) {
				if (arr[j-1] > arr[j]) {
					int temp = arr[j-1];
					arr[j-1] = arr[j];
					arr[j] = temp;
					swapped = true;
				}
			}
			// 如果没有发生交换则已经整体有序
			if (!swapped) break;
		}

		// 打印数组
		for (int num : arr) {
			System.out.print(num + " ");
		}

	}
}