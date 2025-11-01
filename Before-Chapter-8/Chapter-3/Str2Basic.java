public class Str2Basic {

	static void test01() {

		int n1 = 100;
		String str1 = n1 + "";

		float f1 = 1.1f;
		String str2 = f1 + "";

		double d1 = 4.5;
		String str3 = d1 + "";

		boolean b1 = true;
		String str4 = b1 + "";

		char c1 = 'a';
		String str5 = c1 + "";

		System.out.println(str1 + " " + str2 + " " + str3 + " " + str4 + " " + str5);
		// 100 1.1 4.5 true
	}

	static void test02() {
		String s1 = "123";
		int num1 = Integer.parseInt(s1);
		double num2 = Double.parseDouble(s1);
		float num3 = Float.parseFloat(s1);
		long num4 = Long.parseLong(s1);
		byte num5 = Byte.parseByte(s1);
		short num6 = Short.parseShort(s1);
		boolean b = Boolean.parseBoolean("true");


		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		System.out.println(num4);
		System.out.println(num5);
		System.out.println(num6);
		System.out.println(b);

		System.out.println(s1 + 1);		// 1231
		System.out.println(num1 + 1);	// 124
	}

	public static void main(String[] args) {
		test01();
		test02();
	}
}