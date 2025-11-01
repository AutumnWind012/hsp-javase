public class Varargs {
	public static void main(String[] args) {
		//
		// VarMethods vm = new VarMethods();

		// vm.f2(3.14, "hello",5,6,7,8);
	}
}


class Example {
	// 
	public void sum(int n1, int n2) {}

	public void sum(int n1, int n2, int n3) {}

	public void sum(int n1, int n2, int n3, int n4) {}

	public void sum(int ... nums) {}
}