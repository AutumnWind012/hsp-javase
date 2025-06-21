package com.hspedu.staticinner;

public class StaticInner01 {
    public static void main(String[] args) {
        Outer.Inner.foo();
    }
}



class Outer {
    static class Inner {
        public static void foo() {}
    }
}
