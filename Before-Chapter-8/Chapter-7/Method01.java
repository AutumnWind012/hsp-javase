public class Method01 {
	public static void main(String[] args) {
		//
		Person p1 = new Person();
		p1.speak();
		p1.cal01();
		p1.cal02(10);
	}
}

class Person {
	int age;
	String name;

	public void speak() {
		System.out.println("我是一个好人");
	}

	public void cal01() {
		int res = 0;
		for (int i = 1; i <= 1000; ++i) {
			res += i;
		}
		System.out.println(res);
	}

	public void cal02(int n) {
		int res = 0;
		for (int i = 1; i <= n; ++i) {
			res += i;
		}
		System.out.println("cal02 的计算结果 = " + res);
	}

	public int getSum(int a, int b) {
		return a + b;
	}

}