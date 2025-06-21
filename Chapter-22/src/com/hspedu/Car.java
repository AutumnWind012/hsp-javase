package com.hspedu;

public class Car extends Motor {
    public String brand = "保时捷";
    public int price = 1000000;
    public String color = "黑色";

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}


class Motor {}
