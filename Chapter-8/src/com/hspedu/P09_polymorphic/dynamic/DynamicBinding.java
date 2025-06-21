package com.hspedu.P09_polymorphic.dynamic;

public class DynamicBinding {
    public static void main(String[] args) {
        //
        A a = new B();
        System.out.println(a.sum());
        System.out.println(a.sum1());
    }
}

class A {
    public int i = 10;
    public int sum() {
        return getI() + 20;
    }
    public int sum1() {
        return i + 10;
    }
    public int getI() {//子类 getI()
        return i;
    }
}


class B extends A {//子类
    public int i = 20;
    public int sum() {
        return i + 20;
    }
    public int sum1() {
        return i + 10;
    }
    public int getI() {//子类 getI()
        return i;
    }
}