public class Practice01 {
    public static void main(String[] args) {
        char[] arr = new char[26];
        // 存入 A ~ Z
        for (int i = 0; i < arr.length; ++i) {
            arr[i] = (char)('A' + i);
        }
        // 打印
        for (int i = 0; i < arr.length; ++i) {
            System.out.print(arr[i]);
        }
    }
}