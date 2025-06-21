package com.hspedu.P06_Extends;

public class Extends01 {
    public static void main(String[] args) {
        //
        Pupil pupil = new Pupil();
        pupil.name = "小红";
        pupil.age = 9;
        pupil.testing();
        pupil.setScore(80);
        pupil.showInfo();

        System.out.println("==============");

        Graduate graduate = new Graduate();
        graduate.name = "李华";
        graduate.age = 20;
        graduate.testing();
        graduate.setScore(90);
        graduate.showInfo();

    }
}


class Student {
    // 抽取
    public String name;
    public int age;
    private double score;

    public void setScore(double score) {
        this.score = score;
    }

    public void showInfo() {
        System.out.println("学生名 " + name + " 年龄 " + age + " 成绩 " + score);
    }

}


// 模拟小学生考试的情况
class Pupil extends Student{
    public void testing() {
        System.out.println("小学生 + " + name + " 正在考小学数学 ..");
    }
}

// 模拟大学生考试的简单情况
class Graduate extends Student{
    public void testing() {
        System.out.println("大学生 + " + name + " 正在考高等数学 ..");
    }
}
