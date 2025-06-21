package com.hspedu.P01_packageA;

public class test {

    public static void main(String[] args) {

        // 默认为 package A 的 dog
        Dog dog = new Dog();
        System.out.println(dog);

        com.hspedu.P02_packageB.Dog dog1 = new com.hspedu.P02_packageB.Dog();
        System.out.println(dog1);

    }
}
