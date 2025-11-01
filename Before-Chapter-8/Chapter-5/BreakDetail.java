public class BreakDetail {

	public static void main(String[] args) {
		int count = 0;
		label1:
		for (int i = 0; i < 4; ++i) {
		label2:
				for (int j = 0; j < 10; ++j) {
					if (j == 5) break;
					++count;
				}
		}
		System.out.println(count);		// 20

	}

}
