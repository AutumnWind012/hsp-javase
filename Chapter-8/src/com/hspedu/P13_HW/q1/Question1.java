package com.hspedu.P13_HW.q1;

import java.util.Objects;

public class Question1 {

    public static void main(String[] args) {

        Person[] persons = {
                new Person("tom", 18, "sales"),
                new Person("jessie", 20, "human resources"),
                new Person("david", 23, "manager")
        };

        for (int i = 0; i < persons.length - 1; ++i) {
            for (int j = 0; j < persons.length - 1 - i; ++j) {
                if (persons[j].age < persons[j+1].age) {
                    Person temp = persons[j];
                    persons[j] = persons[j+1];
                    persons[j+1] = temp;
                }
            }

        }

        System.out.println(persons);
    }

}



class Person {
    String name;
    int age;
    String job;

    public Person(String name, int age, String job) {
        this.name = name;
        this.age = age;
        this.job = job;
    }
}
