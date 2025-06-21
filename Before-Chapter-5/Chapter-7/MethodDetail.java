
public class MethodDetail {
	public static void main(String[] args) {
		//
		A a = new A();
		a.sayOK();
		a.callB();
	}
}

class A {

	public void print(int n) {
		System.out.println("print 方法被调用");
	}

	public void sayOK() {
		print(10);
	}

	public void callB() {
		// 先创建 B 对象
		B b = new B();
		b.sayHi();

		System.out.println("callB 方法继续执行");
	}

}

class B {

	public void sayHi() {
		System.out.println("sayHi 方法被调用");
	}

}