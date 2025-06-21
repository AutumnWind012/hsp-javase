package com.hspedu.P04_modifier;

public class B {

    public void say() {
        A a = new A();
        // 在同一个包下，可以访问 public , protected 和 默认修饰属性或方法,不能访问 private 属性或方法System.out.println("n1=" + a.n1 + " n2=" + a.n2 + " n3=" + a.n3 );
        System.out.println(a.n1);
        System.out.println(a.n2);
        System.out.println(a.n3);
        // a.m4(); 错误
    }
}
