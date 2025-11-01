public class HomeWork04 {

	static int findpos(int[] nums, int target){
		int low = 0;
		int high = arr.length - 1;
		while (low <= high) {
			int mid = (low + high) / 2;
			if (nums[mid] == target) return mid + 1;
			if (target > nums[mid]) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}
		return low;
	}

	public static void main(String[] args) {
		int arr[] = {10, 12, 45, 90};
		// 找到插入位置
		int pos = findpos(arr, 23);

		// 插入位置超出数组范围
		if (pos >= arr.length) 

		// 插入
		for (int i = pos; i < arr.length; ++i) {

		}


	}
}