package com.hspedu.P05_Encap;


public class Encasulation01 {
    public static void main(String[] args) {
        //

    }
}

class Person {
    public String name;
    private int age;
    private double salary;
    private String job;

    public Person() {}

    // 构造器中调用 set 方法，构造器和 setXxx 结合
    public Person(String name, int age, double salary, String job) {
        setName(name);
        setAge(age);
        setSalary(salary);
        setJob(job);
    }

    public void setName(String name) {
        if (name.length() >= 2 && name.length() <= 6) {
            this.name = name;
        } else {
            System.out.println("名字长度不符合规则");
            this.name = "无名人";
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 1 || age > 120) {
            System.out.println("年龄不合理");
            this.age = 18;      // 给一个默认年龄
        } else {
            this.age = age;
        }
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    //写一个方法，返回属性信息
    public String info() {
        return "信息为 name=" + name + " age=" + age + " 薪水=" + salary;
    }
}
