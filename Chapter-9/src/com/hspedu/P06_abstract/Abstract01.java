package com.hspedu.P06_abstract;

public class Abstract01 {
}


abstract class Animal {
    private String name;

    public Animal(String name) {
        super();
        this.name = name;
    }

    public abstract void eat();
}


abstract class MyAbstractClass {

    private String msg;

    private static final char c1 = 'x';

    public String getMsg() {
        return msg;
    }

    MyAbstractClass() {
        System.out.println("Abstract class constructor.");
    }
}

abstract class E {

    public abstract void foo();

    public abstract void bar();

}

// 子类必须重写父类所有方法
class F extends E {
    @Override
    public void foo() {

    }
    @Override
    public void bar() {

    }
}

// 除非自己也是抽象类
abstract class G extends E {}

class H {
    static void foo() {}
    void bar(){}
}

//class J extends H {
//
//    void foo() {}
//
//    @Override
//    void bar() {
//        super.bar();
//    }
//}

