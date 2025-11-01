public class Homework1112 {

	public static void main(String[] args) {
		//
		System.out.println(method(method(10.0, 20.0), 100));

	}
	// 第十一题
	public static double method(double a, double b) {
		return a;
	}
}

// 第十二题
class Employee {

	String name;
	String gender;
	int age;
	String job;
	double salary;

	public Employee(){}

	public Employee(String name, String gender, int age){
		this.name = name;
		this.gender = gender;
		this.age = age;
	}

	public Employee(String job, double salary){
		this.job = job;
		this.salary = salary;
	}

	public Employee(String name, String gender, int age, String job, double salary){
		this(name, gender, age);
		this.job = job;
		this.salary = salary;
	}

}