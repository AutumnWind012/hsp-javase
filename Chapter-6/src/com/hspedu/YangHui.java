package com.hspedu;



public class YangHui {
    public static void main(String[] args) {
        // 杨辉三角
        int[][] yangHuiArr = yangHuiArr(20);
        printArr(yangHuiArr);
    }

    public static int[][] yangHuiArr(int size) {
        int[][] res = new int[size][];
        for (int i = 0; i < size; i++) {
            res[i] = new int[i + 1];
            // array to be inserted
            for (int j = 0; j < res[i].length; j++) {
                // boundary condition
                if (j == 0 || j == res[i].length - 1) {
                    res[i][j] = 1;
                    continue;
                }
                // 中间元素是其左上角和正上方元素的和
                res[i][j] = res[i - 1][j - 1] + res[i - 1][j];
            }
        }
        return res;
    }

    public static void printArr(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

}
