public class Practice02 {
    public static void main(String[] args) {
        int nums[] = {4, -1, 59, 10, 23};
        int max = nums[0];
        int maxIndex = 0;
        for (int i = 1; i < nums.length; ++i) {
            if (nums[i] > max) {
                max = nums[i];
                maxIndex = i;
            }
        }
        System.out.println(max);
        System.out.println(maxIndex);
    }
}