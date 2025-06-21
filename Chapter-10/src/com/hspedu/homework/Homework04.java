package com.hspedu.homework;

public class Homework04 {
    public static void main(String[] args) {
        // 匿名内部类
        CellPhone cellPhone = new CellPhone();
        double res = cellPhone.testWork(new ICalculator() {
            @Override
            public double perform(double a, double b) {
                return a * b;
            }
        }, 23, 12);
        System.out.println(res);

        // lambda 表达式
        double res1 = cellPhone.testWork((a, b) -> Math.pow(a, b), 2, 10);
        System.out.println(res1);

        // 方法引用
        System.out.println(cellPhone.testWork(Math::max, 410109, 1238510));

    }
}

@FunctionalInterface
interface ICalculator {
    double perform(double a, double b);
}

class CellPhone {
    public double testWork(ICalculator calculator, double a, double b) {
        return calculator.perform(a, b);
    }
}