package com.hspedu;

public class TwoDimensionalArray03 {

    public static void main(String[] args) {

        int[][] arr1 = {{1, 3, 4}, {2, 4}, {5}};

        int[][] arr = new int[3][];
        for (int i = 0; i < 3; i++) {
            arr[i] = new int[i + 1];
            // 遍历
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = i + 1;
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
