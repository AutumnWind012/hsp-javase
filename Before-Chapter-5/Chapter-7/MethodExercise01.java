public class MethodExercise01 {
	public static void main(String[] args) {
		//
		AA a = new AA();

		System.out.println(a.isOdd(4));

		a.print(6, 8, '*');
	}
}


class AA {
	public boolean isOdd(int num) {
		return num % 2 == 1;
	}

	public void print(int row, int col, char c) {
		for (int i = 0; i < row; ++i) {
			// 输出每一行
			for (int j = 0; j < col; ++j) {
				System.out.print(c);
			}
			System.out.println();
		}
	}
}
