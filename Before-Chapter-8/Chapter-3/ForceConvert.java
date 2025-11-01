public class ForceConvert {
	public static void main(String[] args) {
		int i = (int)1.9;
		System.out.println(i);		// 1 精度损失

		int j = 2000;
		byte b1 = (byte)j;
		System.out.println(b1);		// -48 溢出
	}
}