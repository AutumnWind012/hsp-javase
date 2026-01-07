package com.hspedu.P03_throws;

import java.io.FileNotFoundException;
import java.io.IOException;

public class ThrowsDetails {
    public static void main(String[] args) {
        f2();
    }

    public static void f1() throws ArithmeticException {
        int n1 = 10, n2 = 0;
        try {
            double res = n1 / n2;
        } catch (ArithmeticException e) {
            System.out.println("f1捕获到算术异常");
        }
    }

    public static void f2() {
        try {
            f1();
        } catch (ArithmeticException e) {
            System.out.println("f2捕获到算术异常");
        }
    }

}

class Father {
    public void foo() throws RuntimeException {}
}

class Son extends Father {
    @Override
    public void foo() throws RuntimeException {}
}

class Daughter extends Father {
    @Override
    public void foo() throws NullPointerException {}
}


interface Reader {
    void read() throws IOException;
}

class Kindle implements Reader {
    @Override
    public void read() throws FileNotFoundException, RuntimeException {}
}