public class Array01 {

	public static void main(String[] args) {
		// 思路分析
		// double[] 表示是 double 类型的数组，数组名 hens
		// {} 中存放元素
		// double[] 表示是 double 类型的数组，数组名 hens
		// {} 中存放元素
		double[] hens = {3,5,3.4,1,2,4.1};
		double sum = 0;
		// 遍历数组得到数组中所有元素的和
		for (int i = 0; i < 6; ++i) {
			sum += hens[i];
		} 
		sum = 0;
		// range based loop
		for (double hen : hens) {
			sum += hen;
		}

		System.out.println("总体重：" + sum + "，平均体重：" + sum/6);
	}

}