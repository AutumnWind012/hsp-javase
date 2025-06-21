package com.hspedu.P03_clazz;

public class ClassLoad02 {
    public static void main(String[] args) throws ClassNotFoundException {
        Class.forName("B");
    }
}

class A {
    public int n1 = 10;
    public static int n2 = 20;
    public static final int n3 = 30;
}

class B {
    static {
        System.out.println("B 的静态代码块被执行");
        num = 300;
    }
    static int num = 100;
}