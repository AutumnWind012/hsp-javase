public class VarargsExercise {

	public static void main(String[] args) {
		//
		HspMethod method = new HspMethod();

		System.out.println(method.showScore("李同学", 80, 120));
		System.out.println(method.showScore("王同学", 75,40,59));
		System.out.println(method.showScore("张同学", 95,87,122,88,79));
	}

}


class HspMethod {
	public String showScore(String name, double ... scores) {
		//
		double res = 0;
		for (double score : scores) {
			res += score;
		}
		return name + " " + scores.length + " 门课的总分是: " + res;
	}
}



