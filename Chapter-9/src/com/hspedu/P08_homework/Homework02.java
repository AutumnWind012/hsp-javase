package com.hspedu.P08_homework;

/**
 * @author zijun
 * @date 2025/3/2
 */
public class Homework02 {
    public static void main(String[] args) {
        //
        System.out.println(Frock.getNextNum());
        System.out.println(Frock.getNextNum());
        for (int i = 0; i < 3; i++) {
            System.out.println(new Frock().getSerialNumber());
        }
    }
}


class Frock {
    private static int currentNum = 100000;

    private int serialNumber;

    public Frock() {
        serialNumber = getNextNum();
    }

    public static int getNextNum() {
        currentNum += 100;
        return currentNum;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

}