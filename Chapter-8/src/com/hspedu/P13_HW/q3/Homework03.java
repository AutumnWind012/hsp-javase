package com.hspedu.P13_HW.q3;

public class Homework03 {
    public static void main(String[] args) {
        new Professor("老韩", 40, "计算机讲师", 8000, 1.3).introduce();
    }
}


class Teacher {
    private String name;
    private int age;
    private String post;
    private double salary;

    public void introduce() {
        System.out.println("姓名：" + name + "，年龄：" + age + "，职位：" + post + "，工资：" + salary);
    }

    public Teacher(String name, int age, String post, double salary) {
        this.name = name;
        this.age = age;
        this.post = post;
        this.salary = salary;
    }
}

class Professor extends Teacher {
    private double salLevel;

    public Professor(String name, int age, String post, double salary, double salLevel) {
        super(name, age, post, salary);
        this.salLevel = salLevel;
    }

    public Professor(String name, int age, String post, double salary) {
        super(name, age, post, salary);
    }

    @Override
    public void introduce() {
        super.introduce();
        System.out.println("工资级别：" + salLevel);
    }
}

class ViceProf extends Teacher {
    private double salLevel;

    public ViceProf(String name, int age, String post, double salary, double salLevel) {
        super(name, age, post, salary);
        this.salLevel = salLevel;
    }

    @Override
    public void introduce() {
        super.introduce();
        System.out.println("工资级别：" + salLevel);
    }
}

class Lecturer extends Teacher {
    private double salLevel;

    public Lecturer(String name, int age, String post, double salary, double salLevel) {
        super(name, age, post, salary);
        this.salLevel = salLevel;
    }

    @Override
    public void introduce() {
        super.introduce();
        System.out.println("工资级别：" + salLevel);
    }
}