package com.hspedu.P01_static;


public class StaticMethod {

    public static void main(String[] args) {
        //
        Stu tom = new Stu("tom");
        Stu.pay(100);

        Stu helen = new Stu("helen");
        Stu.pay(200);

        Stu.show();

        System.out.println(Math.sqrt(23));

        System.out.println(MyTools.relu(.43));

    }

}


class Stu {
    private String name;

    private static double fee = 0;

    public Stu(String name) {
        this.name = name;
    }

    public static void pay(double fee) {
        Stu.fee += fee;
    }

    public static void show(){
        System.out.println("总学费：" + Stu.fee);
    }
}


class MyTools {

    private MyTools(){};

    public static double relu(double x) {
        return x > 0 ? x : 0;
    }

    public static double sigmoid(double x) {
        return 1 / (1 + Math.exp(x * -1));
    }

}
