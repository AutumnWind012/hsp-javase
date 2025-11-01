package com.hspedu;

public class RecursionHanoi {

    public static void main(String[] args) {

        Tower tower = new Tower();
        tower.move(10, 'A', 'B', 'C');

    }
}


class Tower {
    // start：起始塔 mid：中间塔 end：目标塔
    public void move(int disks, char start, char mid, char end) {
        // 如果只有一个塔
        if (disks == 1) {
            System.out.println(start + "->" + end);
        } else {
            // ① 将起始塔上层的所有盘子挪到中间塔，此时中间塔是下一层递归的目标塔
            move(disks - 1, start, end, mid);
            // ② 将起始塔最底层盘子挪到目标塔
            System.out.println(start + "->" + end);
            // ③ 将中间塔的所有盘子挪到目标塔，此时中间塔是下一层递归的起始塔
            move(disks - 1, mid, start, end);
        }
    }
}
