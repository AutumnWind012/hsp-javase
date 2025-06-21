public class Homework12 {
	public static void main(String[] args) {


		double[] nums = {1,2.6,5.8,6,2,5,1,6,7,8,3.14,2,34,1,4,1};

		System.out.println(A01.max(nums));		// 34.0

		String[] str = {"apple", "banana", "orange", "grape"};

		System.out.println(A02.find(str, "orange"));	// 2
		
	}
}

class A01 {

	private A01(){}

	public static double max(double[] nums) {
		if (nums == null) {
			return -1;
		}
		double max = nums[0];
		for (int i = 0; i < nums.length; ++i) {
			if (nums[i] > max) {
				max = nums[i];
			}
		}
		return max;
	}
}

class A02 {

	private A02(){}

	public static int find(String[] strings, String target) {
		for (int i = 0; i < strings.length; ++i) {
			if (target.equals(strings[i])) {
				return i;
			}
		}
		return -1;
	}
}