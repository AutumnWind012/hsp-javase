package com.hspedu;

public class Recursion02 {
    public static void main(String[] args) {
        //
        H h = new H();
        System.out.println(h.factorial(5));
    }
}


class H {
    public int factorial(int n) {
        if (n <= 1) return 1;
        return n * factorial(n - 1);
    }
}


