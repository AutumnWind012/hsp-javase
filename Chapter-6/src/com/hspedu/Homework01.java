package com.hspedu;

import java.util.Random;

public class Homework01 {

    public static void main(String[] args) {
        int[] arr = {10, 12, 45, 90, 117, 212, 664};
        int[] res = insert2(arr, 1);
        for (int i : res) {
            System.out.print(i + " ");
        }
        System.out.println();

        q7Solution(q5Solution());
    }

    // 找到插入位置
    public static Integer binarySearch(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] == target) return mid;
            if (nums[mid] < target) left = mid + 1;
            else right = mid - 1;
        }
        return left;
    }

    // 插入元素
    public static int[] insert(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return null;
        }
        Integer index = binarySearch(nums, target);
        int[] res = new int[nums.length + 1];
        // 复制数组
        System.arraycopy(nums, 0, res, 0, index);
        res[index] = target;
        System.arraycopy(nums, index, res, index + 1, nums.length - index);
        return res;
    }

    // 手动插入元素
    public static int[] insert2(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return null;
        }
        Integer index = binarySearch(nums, target);
        int[] res = new int[nums.length + 1];
        // 复制数组
        for (int i = 0, j = 0; i < res.length; i++) {
            if (i != index) {
                res[i] = nums[j];
                j++;
            } else {
                res[i] = target;
            }
        }
        return res;
    }

    public static int[] q5Solution() {
        int[] nums = new int[10];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = (int)(Math.random() * 100) + 1;
        }
        double sum = 0;
        int max = Integer.MIN_VALUE, index = -1;
        // 正序打印
        for (int num : nums) {
            System.out.print(num + ", ");
        }

        System.out.println();
        for (int i = 0; i < nums.length; i++) {
            // 倒序打印
            System.out.print(nums[nums.length - 1 - i] + " ");
            // 求平均值
            sum += nums[i];
            // 求最大最小值
            if (nums[i] > max) {
                max = nums[i];
                index = i;
            }
        }

        // 找到是否有 8
        boolean found = false;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 8) {
                found = true;
                break;
            }
        }

        System.out.println();
        System.out.println("平均值 = " + sum / nums.length);
        System.out.println("最大值 = " + max + " 下标 = " + index);
        System.out.println("是否有 8 = " + found);

        return nums;

    }

    public static void q7Solution(int[] nums) {
        if (nums == null || nums.length == 0) {
            return;
        }
        for (int i = 0; i < nums.length - 1; i++) {
            boolean swapped = false;
            for (int j = 0; j < nums.length - 1 - i; j++) {
                if (nums[j] > nums[j + 1]) {
                    swapped = true;
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
            if (!swapped) break;
        }
        System.out.println();

        // print
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }

}
