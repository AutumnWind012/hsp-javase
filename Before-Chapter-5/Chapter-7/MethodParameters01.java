public class MethodParameters01 {
	public static void main(String[] args) {

		int a = 10;
		int b = 20;

		AA obj = new AA();
		// 可以重名
		obj.swap(a, b);

		System.out.println("调用 swap 之后， a = " + a + " b = " + b);
		
	}
}

class AA {

	public void swap(int a, int b) {
		System.out.println("a 和 b 交换之前的值 a = " + a + " b = " + b);
		int temp = a;
		a = b;
		b = temp;
		System.out.println("a 和 b 交换之后的值 a = " + a + " b = " + b);
	}
}