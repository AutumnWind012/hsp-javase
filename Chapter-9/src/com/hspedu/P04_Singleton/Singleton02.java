package com.hspedu.P04_Singleton;

public class Singleton02 {
    public static void main(String[] args) {
        System.out.println(FirstLove.instance);
    }
}



class FirstLove {
    private String name;
    private String dateFirstLove;

    public static int n1 = 10;

    public static FirstLove instance;

    private FirstLove(String name, String dateFirstLove) {
        this.name = name;
        this.dateFirstLove = dateFirstLove;
    }

    public static FirstLove getInstance() {
        if (instance == null) {
            instance = new FirstLove("燕子", "2015-09-06");
        }
        return instance;
    }
}