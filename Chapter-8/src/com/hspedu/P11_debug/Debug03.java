package com.hspedu.P11_debug;

import java.util.Arrays;

public class Debug03 {
    public static void main(String[] args) {
        int[] arr = {-1, -1, 10, -20, 100};
        Arrays.sort(arr);
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
