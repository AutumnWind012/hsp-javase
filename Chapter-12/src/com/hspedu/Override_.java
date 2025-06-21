package com.hspedu;

/**
 * @author zijun
 * @date 2025/3/1
 */
public class Override_ {
    public static void main(String[] args) {
        //
    }
}

abstract class Father {
    public void fly() {
        System.out.println("father fly~~");
    }

    public abstract void foo();
}

class Son extends Father {

    @Override
    public void fly() {
        System.out.println("son fly~~");
    }

    @Override
    public void foo() {}

}


