package com.hspedu.P01_static;

public class ChildGame {

    public static void main(String[] args) {

        Child child = new Child("小红");
        Child child1 = new Child("小明");
        Child child2 = new Child("小粉");

        child.join();
        child1.join();
        child2.join();

        System.out.println("一共有" + Child.count + "个小孩加入了游戏");

    }

}

class Child {

    static int count = 0;

    private String name;

    public Child(String name) {
        this.name = name;
    }

    public void join() {
        System.out.println(name + "加入了游戏");
        ++count;
    }
}
