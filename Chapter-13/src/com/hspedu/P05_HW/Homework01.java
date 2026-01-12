package com.hspedu.P05_HW;

import java.util.Scanner;

public class Homework01 {
    public static void main(String[] args) {
        new EcmDef(args);
    }
}

class EcmDef {

    public EcmDef(String[] args) {
        try {
            if (args.length != 2) {
                throw new ArrayIndexOutOfBoundsException();
            }
            int dvd = Integer.parseInt(args[0]);
            int dvi = Integer.parseInt(args[1]);
            double res = cal(dvd, dvi);
            System.out.println("运算结果=" + res);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("命令行参数不正确");
        } catch (NumberFormatException e1) {
            System.out.println("数据格式有误");
        } catch (ArithmeticException e2) {
            System.out.println("运算错误");
        }
    }

    double cal(int n1, int n2) {
        return (double) n1 / n2;
    }
}
