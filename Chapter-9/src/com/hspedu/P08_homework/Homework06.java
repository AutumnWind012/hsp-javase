package com.hspedu.P08_homework;

public class Homework06 {

}



interface Vehicles {
    void work();
}

class Horse implements Vehicles {
    @Override
    public void work() {

    }
}

class Boat implements Vehicles {
    @Override
    public void work() {

    }
}

class Person {
    private String name;
    private Vehicles vehicles;

    public Person(String name, Vehicles vehicles) {
        this.name = name;
        this.vehicles = vehicles;
    }
}