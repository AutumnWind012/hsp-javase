package com.hspedu.P10_object;

import java.sql.Date;

public class EqualsExercise {
    public static void main(String[] args) {

        Person p1 = new Person("woody", 24, 'M');
        Person p2 = new Person("woody", 24, 'M');
        Person p3 = new Person("jessie", 21, 'F');

        System.out.println(p1.equals(p2));
        System.out.println(p2.equals(p3));

        String s1 = new String("asdf");
        String s2 = new String("asdf");

        int i = s1.hashCode();



    }
}


class Person {
    private String name;
    private int age;
    private char gender;

    public Person(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public char getGender() {
        return gender;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        // 向下转型调用 getter 方法
        if (obj instanceof Person) {
            Person p = (Person) obj;
            return name.equals(p.getName()) && age == p.getAge() && gender == p.getGender();
        }
        return false;
    }
}
