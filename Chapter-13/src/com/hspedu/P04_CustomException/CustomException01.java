package com.hspedu.P04_CustomException;

import java.util.Scanner;

public class CustomException01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("请输入年龄：");
            String string = scanner.next();
            try {
                int age = Integer.parseInt(string);
                if (age < 18 || age > 120) {
                    throw new AgeException("年龄需要在18～120之间");
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("输入有误，请输入一个整数");
            }
        }
    }
}

class AgeException extends RuntimeException {
    public AgeException(String message) {
        super(message);
    }
}