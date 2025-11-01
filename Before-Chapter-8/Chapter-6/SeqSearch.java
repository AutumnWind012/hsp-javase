import java.util.Scanner;


public class SeqSearch {

	// 顺序查找
	static int seqSearch(String[] arr, String target) {
		for (int i = 0; i < arr.length; ++i) {
			if (target.equals(arr[i])) return i;
		}
		return -1;
	}

	public static void main(String[] args) {
		
		// 
		String[] arr = {"白眉鹰王","金毛狮王","紫衫龙王","青翼蝠王"};
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("输入一个名称：");
		String str = scanner.next();

		int ret = seqSearch(arr, str);

		if (ret != -1){
			System.out.println("匹配成功，" + str + " 在数组中第 " + ret + " 个位置。");
		} else {
			System.out.println("sorry，没有找到");
		}
	}
}