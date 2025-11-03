package com.hspedu;

public class RecursionExercise01 {
    public static void main(String[] args) {
        System.out.println(new F().fib(9));
    }
}


class F {
    public int fib(int n) {
        return n == 1 || n == 2 ? 1 : fib(n-1) + fib(n-2);
    }
}
