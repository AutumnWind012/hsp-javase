package com.hspedu.P06_Extends.ExtendsDetail;

public class ExtendsDetail {
    public static void main(String[] args) {
        //
        Son son = new Son();
    }
}

class Person {
    public Person() {
        System.out.println("Person 构造器被调用");
    }
}

class Grandpa extends Person{

    Grandpa(){
        System.out.println("Grandpa 构造器被调用");
    }

}

class Father extends Grandpa {
    public Father() {
        System.out.println("Father 构造器被调用");
    }
}

class Son extends Father {
    public Son() {
        System.out.println("Son 构造器被调用");
    }
}






