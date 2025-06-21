package com.hspedu.P10_object;

public class Equals01 {
    public static void main(String[] args) {
        //
        Sub a = new Sub();
        Sub b = a;
        Sub c = b;
        Base d = a;
        System.out.println(a == b);
        System.out.println(d == c);

        System.out.println(a.equals(d));

        String str = "hello";
        boolean res = "abc".equals(str);

        Integer i = 5;
        i.equals(32);

        System.out.println(res);
    }
}

class Base {}

class Sub extends Base {}
