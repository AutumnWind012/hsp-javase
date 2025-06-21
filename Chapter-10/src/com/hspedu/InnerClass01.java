package com.hspedu;

public class InnerClass01 {
}



class Outer {
    private int n1 = 100;

    public Outer(int n1) {
        this.n1 = n1;
    }
    public void m1() {
        System.out.println("m1()");
    }
    {
        System.out.println("代码块");
    }
    // 内部类
    class Inner {}
}