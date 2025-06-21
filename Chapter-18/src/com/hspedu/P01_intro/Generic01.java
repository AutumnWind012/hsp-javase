package com.hspedu.P01_intro;


import java.util.ArrayList;
import java.util.List;

public class Generic01 {
    public static void main(String[] args) {

        List<Dog> arrayList = new ArrayList<Dog>();

        arrayList.add(new Dog("旺财", 5));
        arrayList.add(new Dog("小黄", 1));
        arrayList.add(new Dog("煤球", 2));



        for (Dog dog : arrayList) {
            System.out.println(dog.getName() + "-" + dog.getAge());
        }

    }
}


class Dog {
    private String name;
    private int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

class Cat {
    private String name;
    private int age;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
