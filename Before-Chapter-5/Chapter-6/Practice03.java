public class Practice03 {
    public static void main(String[] args) {
        int nums[] = {4, -1, 59, 10, 23};
        double sum = 0;
        for (int num : nums) {
            sum += num;
        }
        System.out.println("数组的和：" + sum + "，数组的平均值：" + sum/nums.length);
    }
}