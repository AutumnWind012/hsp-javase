package com.hspedu.P03_pkg;

import java.util.Arrays;
// 将 util 下的所有类都引入

public class Import01 {
    public static void main(String[] args) {
        // 用系统提供的 Arrays 类完成数组排序并打印
        int[] arr = {-1, 20, 2, 13, 3};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
