package com.hspedu.P09_polymorphic.polyparameter;

public class PolyParameter {
    public static void main(String[] args) {
        Employee e = new Worker("Tom", 12000);
        Employee m = new Manager("David", 20000, 9000);
        System.out.println(showEmpAnnual(e));
        System.out.println(showEmpAnnual(m));
    }

    public static double showEmpAnnual(Employee e) {
        return e.getAnnualSal();
    }
}

class Employee {

    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAnnualSal() {
        return getSalary() * 12;
    }
}

class Worker extends Employee {

    public Worker(String name, double salary) {
        super(name, salary);
    }

    public void work() {
        System.out.println(getName() + " is working");
    }

    @Override
    public double getAnnualSal() {
        return super.getAnnualSal();
    }
}

class Manager extends Employee {
    private double bonus;

    public Manager(String name, double salary, double bonus) {
        super(name, salary);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public void manage() {
        System.out.println(getName() + "is managing");
    }

    @Override
    public double getAnnualSal() {
        return super.getAnnualSal() + getBonus();
    }
}




