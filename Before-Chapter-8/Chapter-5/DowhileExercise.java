import java.util.Scanner;

public class DowhileExercise {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
	char ans = ' ';
    do {
		System.out.println("老韩使出五连鞭！");
    	System.out.println("老韩问：还钱吗？ y/n");
		ans = scanner.next().charAt(0);
    } while (ans != 'y');
  }
}