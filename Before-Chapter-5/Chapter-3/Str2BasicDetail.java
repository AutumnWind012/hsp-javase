public class Str2BasicDetail {
	public static void main(String[] args) {
		
		String str  = "hello";

		// 错误格式，抛出异常
		int n1 = Integer.parseInt(str);
		System.out.println(n1);
	}
}