public class ArrayReverse {

	// static void swap(int &a, int &b) {
	// 	int temp = a;
	// 	a = b;
	// 	b = temp;
	// }

	public static void main(String[] args) {
		// 
		int arr[] = {11,22,33,44,55,66,77};
		int mid = arr.length / 2;

		// 原地逆序
		for (int i = 0, j = arr.length - 1; i < mid; ++i, --j) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
		}

		for (int num : arr) {
			System.out.print(num + " ");
		}

		
	}
}