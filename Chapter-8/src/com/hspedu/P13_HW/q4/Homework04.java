package com.hspedu.P13_HW.q4;

public class Homework04 {
    public static void main(String[] args) {
        //
        new Worker("张飞", 300, 21).printSalary();
        new Manager("关羽", 380, 21).printSalary();
    }
}


class Employee {
    String name;
    double dailyWage;
    int workDays;

    public Employee(String name, double dailyWage, int workDays) {
        this.name = name;
        this.dailyWage = dailyWage;
        this.workDays = workDays;
    }

    public void printSalary() {}
}

class Worker extends Employee {

    static final double level = 1.0;
    static final double bonus = 0;

    public Worker(String name, double dailyWage, int workDays) {
        super(name, dailyWage, workDays);
    }

    @Override
    public void printSalary() {
        double sal = bonus + dailyWage * workDays * level;
        System.out.println("员工" + name + "工资：" + sal);
    }
}

class Manager extends Employee {

    static final double level = 1.2;
    static final double bonus = 1000;

    public Manager(String name, double dailyWage, int workDays) {
        super(name, dailyWage, workDays);
    }

    @Override
    public void printSalary() {
        double sal = bonus + dailyWage * workDays * level;
        System.out.println("员工" + name + "工资：" + sal);
    }
}