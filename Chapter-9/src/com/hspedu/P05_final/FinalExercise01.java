package com.hspedu.P05_final;

public class FinalExercise01 {
    public static void main(String[] args) {
        //
        System.out.println(new Circle(5).getArea());
    }

    public void foo(final int num) {
        System.out.println(num);
    }
}


class Circle {
    private double radius;
    private final double PI;

    public Circle(double radius) {
        PI = 3.14;
        this.radius = radius;
    }

    public double getArea() {
        return radius * radius * PI;
    }
}
