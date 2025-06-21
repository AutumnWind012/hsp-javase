package com.hspedu.P02_main;

public class Hello {

    private int n1 = 10;

    public static String name = "小马";

    public static void hi() {
        System.out.println("Hi!");
    }

    public static void main(String[] args) {
        // 静态方法 main 可以直接访问本类的静态成员
        System.out.println(name);
        hi();
        // 静态方法 main 要访问贝类的非静态成员
        // 需要先创建对象，再调用即可
        Hello hello = new Hello();
        System.out.println(hello.n1);
    }
}
