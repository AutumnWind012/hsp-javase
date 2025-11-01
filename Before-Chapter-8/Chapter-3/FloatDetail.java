public class FloatDetail {

	static void test01(){

		float n1 = 1.1f;
		double n2 = 1.1;
		// 小转大会做自动转换
		double n3 = 1.1f;

	}

	static void test02(){
		double num = .123;
		System.out.println(num);		// 0.123
		System.out.println(5.12e2);		// 512
		System.out.println(5.12e-1);	// 0.512
	}

	static void test03(){
		double num = 2.1234567851;
		float num2 = 2.1234567851f;
		System.out.println(num);
		System.out.println(num2);
	}

	static void test04(){
		double num = 2.7;
		double num1 = 8.1 / 3;

		System.out.println(num);
		System.out.println(num1);

		if (num == num1) {
			System.out.println("相等");
		} else {
			System.out.println("不相等");
		}

		// 正确判断方法 —— 判断绝对值差值是否小于最小精度（自己决定）
		if (Math.abs(num - num1) < 0.0000001) {
			System.out.println("相等");
		}
	}

	public static void main(String[] args) {
		test04();
	}
}