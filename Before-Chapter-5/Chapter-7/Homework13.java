public class Homework13 {

	public static void main(String[] args) {
		//
		Circle c = new Circle();
		new PassObject().printAreas(c, 5);
	}
}


class Circle {

	private double radius;

	public Circle(){}

	public Circle(double r) {
		this.radius = r;
	}

	public double findArea() {
		return Math.PI*radius*radius;
	}

	public void setRadius(double r) {
		this.radius = r;
	}

}


class PassObject {

	public void printAreas(Circle c, int times) {
		System.out.println("Radius\tArea");
		for (int i = 1; i <= times; ++i) {
			c.setRadius(i);
			System.out.println((double)i + "\t" + c.findArea());
		}
	}

}