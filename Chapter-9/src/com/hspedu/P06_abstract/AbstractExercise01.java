package com.hspedu.P06_abstract;

public class AbstractExercise01 {
    public static void main(String[] args) {
        Employee jack = new Manager("jack", 999, 50000, 2500);
        jack.work();
        Employee tom = new CommonEmployee("Tom", 888, 8000);
        tom.work();
    }
}


abstract class Employee {
    protected String name;
    protected long id;
    protected double salary;

    public Employee(String name, long id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public abstract void work();

    public String getName() {
        return name;
    }
}


class CommonEmployee extends Employee {

    public CommonEmployee(String name, long id, double salary) {
        super(name, id, salary);
    }

    @Override
    public void work() {
        System.out.println("普通员工 " + name + " 工作中 ...");
    }
}

class Manager extends Employee {

    private double bonus;

    public Manager(String name, long id, double salary, double bonus) {
        super(name, id, salary);
        this.bonus = bonus;
    }

    @Override
    public void work() {
        System.out.println("经理 " + super.name + " 工作中 ...");
    }
}