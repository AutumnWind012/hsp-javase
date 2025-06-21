package com.hspedu;

public class TwoDimensionalArray01 {

    public static void main(String[] args) {
        //
        int[][] arr = { {0, 0, 0, 0, 0, 0}, {0, 0, 1, 0, 0, 0,},
                        {0, 2, 0, 3, 0, 0}, {0, 0, 0, 0, 0, 0 }};

        // 输出二维图形

        // arr.length 是统计有多少个一维数组
        for (int i = 0; i < arr.length; i++) {  // by row
            // arr[i].length 得到对应的每个一维数组的长度
            for (int j = 0; j < arr[i].length; j++) {   // by column
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
