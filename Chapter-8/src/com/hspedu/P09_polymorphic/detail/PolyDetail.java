package com.hspedu.P09_polymorphic.detail;

public class PolyDetail {

    public static void main(String[] args) {
        //
        Animal animal = new Cat();
        animal.eat();
        animal.run();
        animal.show();
        animal.sleep();

        // 向下转型基本语法
        Dog dog = (Dog) animal;


    }

}

class Animal {
    String name = "动物";
    int age = 10;
    public void sleep(){
        System.out.println("睡");
    }
    public void run(){
        System.out.println("跑");
    }
    public void eat(){
        System.out.println("吃");
    }
    public void show(){
        System.out.println("hello,你好");
    }
}

class Cat extends Animal {
    public void eat(){//方法重写
        System.out.println("猫吃鱼");
    }
    public void catchMouse(){//Cat 特有方法
        System.out.println("猫抓老鼠");
    }
}

class Dog extends Animal {

}




