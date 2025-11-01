package com.hspedu.P13_HW.q5;

public class Question5 {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("顺平", 6000);
        teacher.setClassHours(800);
        teacher.setClassWage(100);
        teacher.printSal();
    }
}



class Employee {
    // 属性
    private String name;
    private double sal;
    // 带薪月份默认12月
    private int salMonth = 12;

    // 方法
    public Employee(String name, double sal) {
        this.name = name;
        this.sal = sal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    public int getSalMonth() {
        return salMonth;
    }

    public void setSalMonth(int salMonth) {
        this.salMonth = salMonth;
    }

    public void printSal() {
        System.out.println(name + "，年工资是：" + (salMonth * sal));
    }
}

class Worker extends Employee {
    public Worker(String name, double sal) {
        super(name, sal);
    }
    @Override
    public void printSal() {
        System.out.print("工人：");
        super.printSal();
    }
}

class Farmer extends Employee {
    public Farmer(String name, double sal) {
        super(name, sal);
    }
    @Override
    public void printSal() {
        System.out.print("农民：");
        super.printSal();
    }
}

class Waiter extends Employee {
    public Waiter(String name, double sal) {
        super(name, sal);
    }
    @Override
    public void printSal() {
        System.out.println("服务员：");
        super.printSal();
    }
}

class Teacher extends Employee {
    // 属性
    private int classHours;
    private double classWage;

    public Teacher(String name, double sal) {
        super(name, sal);
    }

    public void setClassHours(int classHours) {
        this.classHours = classHours;
    }

    public void setClassWage(double classWage) {
        this.classWage = classWage;
    }

    @Override
    public void printSal() {
        System.out.println("老师：" + getName() + "，年工资是：" + (getSal() * getSalMonth() + classHours * classWage));
    }
}

class Scientist extends Employee {
    private double bonus;

    public Scientist(String name, double sal) {
        super(name, sal);
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public void printSal() {
        System.out.println("老师：" + getName() + "，年工资是：" + (getSal() * getSalMonth() + bonus));
    }
}