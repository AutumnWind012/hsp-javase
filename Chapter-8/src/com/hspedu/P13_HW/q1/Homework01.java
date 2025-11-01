package com.hspedu.P13_HW.q1;

public class Homework01 {
    public static void main(String[] args) {
        //
        Person[] persons = {
                new Person("Jack", 30, "销售"),
                new Person("Lucy", 27, "人事"),
                new Person("Rebecca", 33, "产品经理")};

        // 冒泡排序
        for (int i = 0; i < persons.length - 1; i++) {
            for (int j = persons.length - 1; j > i; j--) {
                if (persons[j-1].age < persons[j].age) {
                    Person temp = persons[j];
                    persons[j] = persons[j-1];
                    persons[j-1] = temp;
                }
            }
        }

        for (Person person : persons) {
            System.out.println(person);
        }
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

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", job='" + job + '\'' +
                '}';
    }
}