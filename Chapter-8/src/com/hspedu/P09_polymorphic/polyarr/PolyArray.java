package com.hspedu.P09_polymorphic.polyarr;

public class PolyArray {
    public static void main(String[] args) {
        Person[] persons = new Person[4];
        persons[0] = new Person("jack", 20);
        persons[1] = new Student("Harry", 17, 93);
        persons[2] = new Student("Ron", 18, 86);
        persons[3] = new Teacher("Hagrid", 60, 7500);

        // 编译类型是 Person，运行类型动态改变，由 JVM 判断
        for (Person person : persons) {
            System.out.println(person.say());
            if (person instanceof Student) {
                ((Student) person).study();
            }
            if (person instanceof Teacher) {
                ((Teacher) person).teach();
            }
            System.out.println("==============");
        }
    }
}

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String say() {
        // 返回名字和年龄
        return name + "\t age=" + age;
    }
}

class Student extends Person {
    private double score;

    public Student(String name, int age, double score) {
        super(name, age);
        this.score = score;
    }

    @Override
    public String say() {
        return super.say() + "\t score=" + score;
    }

    public void study() {
        System.out.println(super.getName() + " is studying");
    }

}

class Teacher extends Person {
    private double salary;

    public Teacher(String name, int age, double salary) {
        super(name, age);
        this.salary = salary;
    }

    @Override
    public String say() {
        return super.say() + "\t salary=" + salary;
    }

    public void teach() {
        System.out.println(super.getName() + " is teaching");
    }
}
