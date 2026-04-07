package com.hspedu;

public class StringExercise05 {
    public static void main(String[] args) {
        Person p1 = new Person();
        Person p2 = new Person();

        p1.name = "hspedu";
        p2.name = "hspedu";

        System.out.println(p1.name.equals(p2.name));
        System.out.println(p1.name == p2.name);
        System.out.println(p1.name == "hspedu");
    }
}

class Person {
    String name;
}
