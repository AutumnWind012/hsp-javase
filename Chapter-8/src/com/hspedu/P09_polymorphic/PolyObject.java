package com.hspedu.P09_polymorphic;

public class PolyObject {
    public static void main(String[] args) {
        //
        Vehicle vehicle = new Vehicle();
        vehicle.move();
        //
        vehicle = new Truck();
        vehicle.move();
        //
        vehicle = new Bus();
        vehicle.move();
    }
}

class Vehicle {
    public void move() {
        System.out.println("vehicle is moving");
    }
}

class Truck extends Vehicle {
    public void move() {
        System.out.println("truck is moving");;
    }
}

class Bus extends Vehicle {
    public void move() {
        System.out.println("bus is moving");
    }
}
