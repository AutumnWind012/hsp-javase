package com.hspedu.P06_Extends.ExtendsTheory;

public class ExtendsTheory {
    public static void main(String[] args) {
        //
        Son son = new Son();
        //
//        System.out.println(son.name);
//        System.out.println(son.getAge());
        System.out.println(son.hobby);
    }
}


class GrandPa {
    String name = "大头爷爷";
    String hobby = "旅游";
}

class Father extends GrandPa {//父类
    String name = "大头爸爸";
    private int age = 39;
}

class Son extends Father { //子类
    private String name = "大头儿子";
}