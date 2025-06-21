package com.hspedu.localanonymous;

public class AnonymousDetails01 {
    public static void main(String[] args) {
        new Outer02().foo();
    }
}

class Outer02 {
    public void foo() {
        Ani ani = () -> System.out.println("你好，我是 Lambda 表达式！");
        ani.greet();
    }
}


interface Ani {
    void greet();
}