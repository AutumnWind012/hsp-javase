public class ThisDetail {
	public static void main(String[] args) {
		//
		T t1 = new T();
		t1.f(9);
	}
}

class T {

	String str = "Hey";
	int a = 12;

	public void f(int a) {
		System.out.println(a);
		System.out.println(this.a);
		System.out.println(this.str);
	}
}