public class var01 {

	static void test01() {

		int age = 18;
		double gpa = 3.7;
		char gender = 'M';
		String name = "Ron";

		System.out.println("Student Information: ");
		System.out.println(name);
		System.out.println(age);
		System.out.println(gender);
		System.out.println(gpa);

	}

	static void test02() {

		int a = 50;
		// 可以不断修改，不过必须是同类型
		a = 88;
		// 报错：不兼容的类型
		int a = 77;
	}


	public static void main(String[] args) {

		test02();

	}
}