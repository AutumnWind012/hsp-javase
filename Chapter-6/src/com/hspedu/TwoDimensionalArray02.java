package com.hspedu;

public class TwoDimensionalArray02 {

    public static void main(String[] args) {

        int[][][] arr = new int[2][3][4];
        arr[1][1][3] = 7;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                for (int k = 0; k < arr[i][j].length; k++) {
                    System.out.print(arr[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }

    }


}
