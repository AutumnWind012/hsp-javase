package com.hspedu.P04_Singleton;

public class Singleton01 {
    public static void main(String[] args) {
        //
        FirstLove firstLove = FirstLove.getInstance();
        System.out.println(firstLove);

        FirstLove anotherLove = FirstLove.getInstance();
        System.out.println(anotherLove);

        System.out.println(firstLove == anotherLove);
    }
}


//
//class FirstLove {
//    private String name;
//    private String dateFirstLove;
//
//    private static FirstLove instance = new FirstLove("燕子", "2015-09-06");
//
//    private FirstLove(String name, String dateFirstLove) {
//        this.name = name;
//        this.dateFirstLove = dateFirstLove;
//    }
//
//    public static FirstLove getInstance() {
//        return instance;
//    }
//}


class Singleton {
    // 1. 私有构造函数
    private Singleton() {}

    // 2. 静态内部类
    private static Singleton instance;

    // 3. 提供全局访问点
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }

        return instance;
    }
}

class Cat {

}
