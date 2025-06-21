package com.hspedu.P08_override;

public class OverrideExercise {
    public static void main(String[] args) {
        //
        Person person = new Person("小红", 19);
        System.out.println(person.say());

        Student student = new Student("李华", 23, 1123490, 88);
        System.out.println(student.say());
    }
}


class Person {
    private String name;
    private int age;

    public Person(){
        System.out.println("正在调用 Person 类无参构造器～");
    }

    public Person(String name, int age) {
        System.out.println("正在调用 Person 类有参构造器～");
        this.name = name;
        this.age = age;
    }

    public String say() {
        return "你好，我是" + this.name + "，今年" + this.age + "岁";
    }
}

class Student extends Person {
    private long id;
    private double score;

    public Student(String name, int age, long id, double score) {
        super(name, age);
        this.id = id;
        this.score = score;
    }

    public String say() {
        return super.say() + "，id：" + id + "，分数：" + score;
    }
}