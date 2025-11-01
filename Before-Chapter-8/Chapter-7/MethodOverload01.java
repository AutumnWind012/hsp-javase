public class MethodOverload01 {

	public static void main(String[] args) {
		MyCalculator mc = new MyCalculator();
		System.out.println(mc.calculate(1, 2));
	}
}


class MyCalculator {
	public int calculate(int n1, int n2) {
		return n1 + n2;
	}

	public void calculate(int n1, int n2) {
		System.out.println(n1 + n2);
	}
}