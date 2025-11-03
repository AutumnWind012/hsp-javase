package com.hspedu;

public class RecursionExercise02 {
    public static void main(String[] args) {
        System.out.println(new Solution().peach(11));
    }
}


class Solution {
    // base case：第 10 天只剩一个桃子
    // 递归：第 x 天桃子的数量 = (第 x+1 天桃子的数量  + 1)* 2
    // days 第几天桃子的数量
    public int peach(int days) {
        if (days > 1 && days < 11) {
            if (days == 10) {
                return 1;
            }
            return (peach(days + 1) + 1) * 2;
        }
        return -1;
    }
}
