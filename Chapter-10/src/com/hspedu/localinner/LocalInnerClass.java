package com.hspedu.localinner;

public class LocalInnerClass {
    public static void main(String[] args) {
        //
        Outer caller = new Outer();
        caller.m1();
        System.out.println(caller);
    }
}


class Outer {
    private int n1 = 100;

    public void m1() {
        // 局部内部类
        class LocalInner {
            private int n1 = 200;
            private int n5 = 500;
            public void f1() {
                System.out.println("n5=" + this.n5);
                System.out.println("n1=" + Outer.this.n1);
                Outer.this.m2();
            }
            public void m2() {
                System.out.println("m2 from InnerClass is being called.");
            }
        }
        new LocalInner().f1();
    }

    private void m2() {
        System.out.println("m2 from OuterClass is being called.");
    }
}