package com.hspedu.P07_interface;

public class Interface02 {
    public static void main(String[] args) {
        new D().baz();
    }
}

interface IB {
    int n1 = 10;
    default void foo() {
        System.out.println("I love interface");
    }
}

interface IC {
    void bar();
}

interface ID extends IB, IC {

}

class D implements IB {
    public void baz() {
        foo();
        System.out.println(D.n1);
    }
}



//interface IA {
//    public final void bar();
//}

interface MyInterface {
    // 抽象方法
    void myAbstractMethod();

    // 默认方法
    default void myDefaultMethod() {
        System.out.println("This is a default method.");
    }

    // 静态方法
    static void myStaticMethod() {
        System.out.println("This is a static method.");
    }

    // 常量
    String MY_CONSTANT = "This is a constant.";
}

class MyClass implements MyInterface {
    @Override
    public void myAbstractMethod() {
        System.out.println("Implements the abstract method from interface");
    }
}

interface IAnimal {

    int a = 0;
    
    void eat();
    void sleep();
}

class Cat implements IAnimal {
    @Override
    public void eat() {}

    @Override
    public void sleep() {}
}

abstract class Tiger implements IAnimal {

}