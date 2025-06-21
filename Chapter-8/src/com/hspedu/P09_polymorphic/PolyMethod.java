package com.hspedu.P09_polymorphic;



public class PolyMethod {
    public static void main(String[] args) {
        //
        A a = new A();
        B b = new B();
        a.say();
        b.say();
    }
}

class A extends B {
    public void say() {
        System.out.println("B say() is called");
    }
}

class B {
    // 重载
    public int sum(int n1, int n2) {
        return n1 + n2;
    }
    public int sum(int n1, int n2, int n3) {
        return n1 + n2 + n3;
    }
    // 重写
    public void say() {
        System.out.println("A say() is called");
    }
}