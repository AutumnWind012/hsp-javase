public class Homework456 {

	public static void main(String[] args) {
		//
		int[] arr1 = {1,2,3,4,5,6,7};
		int[] arr2 = A03.copyArr(arr1);

		Circle c1 = new Circle(3);

		c1.showPerimeter();
		c1.showArea();

		Calculator cal = new Calculator(3, 5);
		cal.add();
		cal.subtract();
		cal.mul();
		cal.divide();

	}
}


class A03 {

	private A03(){}

	public static int[] copyArr(int[] arr) {
		// 如果数组为空，返回 null
		if (arr == null) {
			return null;
		}
		// 申请新数组空间
		int[] newArr = new int[arr.length];
		// 拷贝元素
		for (int i = 0; i < arr.length; ++i) {
			newArr[i] = arr[i];
		}
		return newArr;
	}
}


class Circle {

	double radius;

	public Circle(int radius) {
		this.radius = radius;
	}

	public void showPerimeter() {
		System.out.println(2 * Math.PI * radius);
	}

	public void showArea() {
		System.out.println(Math.PI * radius * radius);
	}

}


class Calculator {

	int a;
	int b;

	public Calculator(int a, int b) {
		this.a = a;
		this.b = b;
	}

	public void add() {
		System.out.println("a + b = " + (a + b));
	}

	public void subtract() {
		System.out.println("a - b = " + (a - b));
	}

	public void mul() {
		System.out.println("a * b = " + (a * b));
	}

	public void divide() {
		if (b == 0) {
			System.out.println("Cannot divide by zero");
		}
		System.out.println("a / b = " + (a / b));
	}

}






