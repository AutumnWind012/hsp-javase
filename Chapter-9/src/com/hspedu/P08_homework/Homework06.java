package com.hspedu.P08_homework;

public class Homework06 {
    public static void main(String[] args) {
        Person tang = new Person("唐僧", null);
        tang.onRoad();
        tang.passRiver();
        tang.onRoad();
        tang.climbMountain();
        tang.onRoad();
    }
}


interface Vehicles {
    void work();
}

class Horse implements Vehicles {

    private String name;

    public Horse(String name) {
        this.name = name;
    }

    @Override
    public void work() {
        System.out.println("用马儿赶路，驾～");
    }
}

class Boat implements Vehicles {
    @Override
    public void work() {
        System.out.println("过河的时候，使用小船");
    }
}

class Fan implements Vehicles {

    private String name;

    public Fan(String name) {
        this.name = name;
    }

    @Override
    public void work() {
        System.out.println("要想翻过火焰山，借来芭蕉扇～");
    }
}


class VehiclesFactory {

    private VehiclesFactory(){}

    public static Horse horse = new Horse("白龙马");

    public static Fan fan = new Fan("芭蕉扇");

    public static Horse getHorse() {
        return horse;
    }

    public static Fan getFan() {
        return fan;
    }

    public static Boat getBoat() {
        return new Boat();
    }
}

class Person {
    private String name;
    private Vehicles vehicles;

    public Person(String name, Vehicles vehicles) {
        this.name = name;
        this.vehicles = vehicles;
    }

    public void passRiver() {
        // 先得到船
        if (!(vehicles instanceof Boat)) {
            vehicles = VehiclesFactory.getBoat();
        }
        this.vehicles.work();
    }

    public void onRoad() {
        if (!(vehicles instanceof Horse)) {
            vehicles = VehiclesFactory.getHorse();
        }
        this.vehicles.work();
    }

    public void climbMountain() {
        if (!(vehicles instanceof Fan)) {
            vehicles = VehiclesFactory.getFan();
        }
        this.vehicles.work();
    }
}

