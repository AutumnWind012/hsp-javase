public class Homework14 {
	public static void main(String[] args) {
		//
	}


}


class Game {

	void play(Player p) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("剪刀石头布～");
		// 0,1,2 的随机数
		int choice = (int)(Math.random() * 2)；
		int playerChoice = scanner.nextInt();
		switch (playerChoice - choice) {
			case 0:
				System.out.println("平局");
				break;
			case -1:
				System.out.println(p.name + "获胜");
				break;
			case -2:
				System.out.println(p.name + "输了");
				break;
			case 1:
				System.out.println(p.name + "");
			default:
				System.out.println("输入错误");
				break;
		}

	}

}

class Player {
	String name;
	int[] gameResult;
}