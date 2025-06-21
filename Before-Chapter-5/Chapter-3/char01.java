// 演示 char 的基本使用

public class char01 {

	static void test01() {
		char c1 = 'a';
		char c2 = '\t';
		char c3 = '韩';
		char c4 = 97;
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
	}

	static void test02() {
		char c1 = 97;
		char c2 = 'a';
		System.out.println(c1); 		// a
		System.out.println((int)'a');	// 97
	}

	public static void main(String[] args) {
		test02();
	}

}