package com.hspedu.P03_codeblock.inherit;

public class Details {
    public static void main(String[] args) {
        //
        new B();
    }
}


class A {
    private static int n1 = setVal01();

    static {
        // (2)
        System.out.println("A 的静态代码块被调用 ...");
    }

    {
        // (7)
        System.out.println("A 的普通代码块被调用 ...");
    }

    public int n3 = setVal02();

    private static int setVal01() {
        // (1)
        System.out.println("A 静态属性初始化方法被调用 ...");
        return 10;
    }

    private int setVal02() {
        // (8)
        System.out.println("A 普通属性初始化方法被调用 ...");
        return 20;
    }

    public A() {
        // (6) super()
        // 普通代码块和普通属性初始化
        // (9)
        System.out.println("A 的构造器被调用 ...");
    }
}


class B extends A {
    static {
        // (3)
        System.out.println("B 的静态代码块被调用 ...");
    }

    private static int n3 = setVal03();

    {
        // (10)
        System.out.println("B 的普通代码块被调用 ...");
    }

    public int n5 = setVal04();

    private static int setVal03() {
        // (4) 类加载完毕
        System.out.println("B 静态属性初始化方法被调用 ...");
        return 30;
    }

    private int setVal04() {
        // (11)
        System.out.println("B 普通属性初始化方法被调用 ...");
        return 40;
    }

    public B() {
        // (5) super()
        // 普通代码块和普通属性初始化
        // (12)
        System.out.println("B 的构造器被调用 ...");
    }
}

class C {
    private int n1 = 100;
    private static int n2 = 200;
    private void m1() {}
    private static void m2() {}
    {
        System.out.println(n2);
        m2();
        System.out.println(n1);
        m1();
    }
}