package com.hspedu.P03_pkg;

import com.hspedu.P04_modifier.A;

public class Test {
    public static void main(String[] args) {
        A a = new A();
        // 只能访问到 public
        System.out.println(a.n1);
    }
}
