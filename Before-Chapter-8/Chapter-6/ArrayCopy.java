public class ArrayCopy {
	public static void main(String[] args) {
		// 
		int arr1[] = {10,20,30};

		// 在堆区开辟了一片新的空间
		int arr2[] = new int[arr1.length];

		for (int i = 0; i < arr1.length; ++i){
			arr2[i] = arr1[i];
		}

		for (int i : arr2) {
			System.out.print(i + " ");
		}
	}
}