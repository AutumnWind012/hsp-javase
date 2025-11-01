public class practice01 {
	public static void main(String[] args) {
		int a = 50;
		int b = 10;

		if ((a+b) % 5 == 0 && (a+b) % 3 == 0) {
			System.out.println("可以被 3 和 5 整除");
		} else {
			System.out.println("不可以被 3 和 5 整除");
		}
	}
}