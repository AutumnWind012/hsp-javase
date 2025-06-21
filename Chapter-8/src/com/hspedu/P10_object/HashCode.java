package com.hspedu.P10_object;

public class HashCode {
    public static void main(String[] args) {
        AA a1 = new AA();
        AA a2 = new AA();
        AA a3 = a1;
        System.out.println("a1.hashCode() = " + a1.hashCode());
        System.out.println("a2.hashCode() = " + a2.hashCode());
        System.out.println("a3.hashCode() = " + a3.hashCode());
    }
}

class AA {}
