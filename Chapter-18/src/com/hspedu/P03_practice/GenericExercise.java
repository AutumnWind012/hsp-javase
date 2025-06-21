package com.hspedu.P03_practice;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.Objects;

public class GenericExercise {
    public static void main(String[] args) {
        //
        ArrayList<Employee> employees = new ArrayList<>();

        employees.add(new Employee("Tom", 3300D, new MyDate(21, 12, 1981)));
        employees.add(new Employee("Tommy", 1500D, new MyDate(4, 5, 1985)));
        employees.add(new Employee("Tom", 5000D, new MyDate(23, 7, 1977)));

        employees.sort(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                // 姓名一致，使用出生日期排序
                if (o1.getName().equals(o2.getName())) {
                    int year1 = o1.getBirthday().getYear() * 10000;
                    int month1 = o1.getBirthday().getMonth() * 100;
                    int day1 = o1.getBirthday().getDay();
                    int sum1 = year1 + month1 + day1;

                    int year2 = o2.getBirthday().getYear() * 10000;
                    int month2 = o2.getBirthday().getMonth() * 100;
                    int day2 = o2.getBirthday().getDay();
                    int sum2 = year2 + month2 + day2;

                    return sum1 - sum2;
                }
                // 转换为字符串数组，一一比较
                int i1 = o1.getName().compareTo(o2.getName());

                char[] o1Name = o1.getName().toCharArray();
                char[] o2Name = o2.getName().toCharArray();
                int i = 0;
                while (i < o1Name.length && i < o2Name.length) {
                    if (o1Name[i] != o2Name[i]) {
                        return o1Name[i] - o2Name[i];
                    }
                    i++;
                }
                // 某一个名字提前结束，我们将名字更短的视为更大
                return o1Name.length - o2Name.length;
            }
        });


        for (Employee employee : employees) {
            System.out.println(employee);
        }

    }


}


class Employee {
    private String name;
    private Double sal;
    private MyDate birthday;

    public Employee(String name, Double sal, MyDate birthday) {
        this.name = name;
        this.sal = sal;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public Double getSal() {
        return sal;
    }

    public MyDate getBirthday() {
        return birthday;
    }

    @Override
    public String toString() {
        return "姓名：" + name
                + "， 工资：" + sal
                + "，出生日期：" + birthday;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }
}


class MyDate<T> implements Comparator<T>{

    private int day;
    private int month;
    private int year;

    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getMonth() {
        return month;
    }
    public void setMonth(int month) {
        this.month = month;
    }
    public int getDay() {
        return day;
    }
    public void setDay(int day) {
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public int compare(T o1, T o2) {
        return 0;
    }

    @Override
    public String toString() {
        return getDay() + "/" + getMonth() + "/" + getYear();
    }
}
