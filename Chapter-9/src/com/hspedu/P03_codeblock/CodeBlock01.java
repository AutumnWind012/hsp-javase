package com.hspedu.P03_codeblock;

public class CodeBlock01 {
    public static void main(String[] args) {
        //
        Movie movie = new Movie("泰坦尼克号", "詹姆斯卡梅隆");
        System.out.println("========================");
        Movie movie1 = new Movie("冰雪奇缘");

    }
}



class Movie {

    private String name;
    private String producer;
    private double price;

    {
        System.out.println("电影屏幕打开 .... ");
        System.out.println("广告开始 ....");
    }

    public Movie(String name) {

        this.name = name;
    }

    public Movie(String name, String producer) {
        this.name = name;
        this.producer = producer;
    }

    public Movie(String name, String producer, double price) {
        this.name = name;
        this.producer = producer;
        this.price = price;
    }
}
