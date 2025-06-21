package com.hspedu.P01_intro;

import java.util.*;

public class GenericsExercise {
    public static void main(String[] args) {

        Student s0 = new Student("Harry", 17);
        Student s1 = new Student("Hermione", 18);
        Student s2 = new Student("Ronald", 18);

        HashSet<Student> set = new HashSet<>();
        set.add(s0);
        set.add(s1);
        set.add(s2);

        for (Student student : set) {
            System.out.println(student.toString());
        }

        System.out.println("========================");

        HashMap<String, Student> map = new HashMap<>();
        map.put(s0.name, s0);
        map.put(s1.name, s1);
        map.put(s2.name, s2);

        //
        Set<String> keySet = map.keySet();
        for (String key : keySet) {
            System.out.println(map.get(key));
        }

        System.out.println("========================");

        // 通过 entrySet 遍历
        Set<Map.Entry<String, Student>> entries = map.entrySet();
        Iterator<Map.Entry<String, Student>> iterator = entries.iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Student> next =  iterator.next();
            System.out.println(next.getKey() + "-" + next.getValue());
        }

    }
}


class Student {
    public String name;
    public int age;
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
