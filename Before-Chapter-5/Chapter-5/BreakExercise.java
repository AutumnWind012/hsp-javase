import java.util.Scanner;

public class BreakExercise {
	public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
		String username = "";
		String password = "";
		int chances = 3;
		while (chances > 0) {
			System.out.println("输入用户名：");
			username = scanner.next();
			System.out.println("输入密码：");
			password = scanner.next();
			// 使用 equals 时将常量字符串写在前面，避免空指针
			if ("丁真".equals(username) || "666".equals(password)) {
				System.out.println("登陆成功");
				break;
			}
			--chances;
			if (chances > 0){
				System.out.println("登陆失败，还有 " + chances + " 次登陆机会");
			} else {
				System.out.println("登陆失败");
			}
		}
	 }
}
