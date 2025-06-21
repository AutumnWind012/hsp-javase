public class OverloadExercise {
	public static void main(String[] args) {
		//
		Methods m = new Methods();

		m.m(5);
		m.m(5, 20);
		m.m("past moonlight");

		System.out.println(m.max(15,27));
		System.out.println(m.max(3.14,2.71));
		System.out.println(m.max(3.14,2.71,42));

	}
}


class Methods {

	public void m(int a) {
		System.out.println(a*a*a);
	}

	public void m(int a, int b) {
		System.out.println(a * b);
	}

	public void m(String str) {
		System.out.println(str);
	}


	public int max(int a, int b) {
		return a > b ? a : b;
	}

	public double max(double a, double b) {
		return a > b ? a : b;
	}

	public double max(double a, double b, double c) {
		System.out.println("ddd");
		return max(max(a,b),c);
	}

	public double max(double a, double b, int c) {
		System.out.println("ddi");
		return max(max(a,b),c);
	}

}