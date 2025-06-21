package com.hspedu.memberinner;

public class MemberInner01 {
    public static void main(String[] args) {
        //
        Outer.Inner inner = new Outer.Inner();
    }
}


class Outer {
    private int n1 = 10;
    public static class Inner {
        public static final int n1 = 10;
    }
}