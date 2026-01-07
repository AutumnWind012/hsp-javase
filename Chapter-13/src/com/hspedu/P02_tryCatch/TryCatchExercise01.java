package com.hspedu.P02_tryCatch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatchExercise01 {
    public static void main(String[] args) {
        typeNum();
    }

    public static void typeNum() {
        Scanner scanner = new Scanner(System.in);
        String num;
        Integer i = null;
        while(true) {
            System.out.print("请输入一个整数：");
            try {
                num = scanner.next();
                i = Integer.parseInt(num);
                break;
            } catch (InputMismatchException | NumberFormatException e) {
                System.out.println("输入格式有误");
            }
        }
        System.out.println("输入的数字是：" + i);
    }
}
