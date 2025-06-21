package com.hspedu.homework;

public class Homework05 {
    public static void main(String[] args) {
        //
        new A().foo();
    }
}

class A {

    private final String NAME = "laowang";

    public void foo() {
        class B {
            private final String NAME = "laohan";
            public void show() {
                System.out.println("内部类的NAME=" + NAME + ", 外部类的NAME=" + A.this.NAME);
            }
        }
        new B().show();
    }
}
