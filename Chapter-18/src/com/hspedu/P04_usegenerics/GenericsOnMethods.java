package com.hspedu.P04_usegenerics;

import java.util.ArrayList;

public class GenericsOnMethods {
    public static void main(String[] args) {
        //

    }
}


class Car {

    public <T, R> void fly(T t, R r) {
        System.out.println(t.getClass());
        System.out.println(r.getClass());
    }
}


class Fish<T, R> {  // 泛型类


}