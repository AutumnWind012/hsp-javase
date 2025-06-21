public class practice6 {
	public static void main(String[] args) {
		int a = 1 >> 2;			// a = 1 /2 /2  = 0

		int b = -1 >> 2;		// b = 1000 0000 ... 0000 0001 = -1

		int c = 1 << 2;			// c = 1 *2 *2 = 4

		int d = -1 << 2;		// c = -1 *2 *2 = 1000 0000 ... 0000 0100 = -4

		int e = 3 >>> 2;		// e = 0000 0000 ... 0000 0000 = 0

		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);

	}
}