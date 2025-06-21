package com.hspedu.P03_codeblock;

public class CodeBlockDetails2 {
    public static void main(String[] args) {
        new A();
    }
}


class A {
    // 构造器
    public A() {
        // 隐藏的执行要求
        // super()
        // 调用普通代码块
        System.out.println("A 的构造器被调用 ...");
    }
    {
        System.out.println("A 的 1 号普通代码块被调用 ...");
    }
    public int n2 = setN2();
    private static int n1 = setN1();
    static {
        System.out.println("A 的 1 号静态代码块被调用 ...");
    }
    public static int setN1() {
        System.out.println("静态方法 setN1 被调用 ...");
        return 10;
    }
    public int setN2() {
        System.out.println("方法 setN2 被调用 ...");
        return 20;
    }
}

