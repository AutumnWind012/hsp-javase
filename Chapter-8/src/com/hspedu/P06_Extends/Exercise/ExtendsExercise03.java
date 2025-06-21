package com.hspedu.P06_Extends.Exercise;

public class ExtendsExercise03 {
    public static void main(String[] args) {
        //
        Desktop desktop = new Desktop("i7", "8GB", "512GB", "ATX");
        desktop.printInfo();

        System.out.println("================================");

        Laptop laptop = new Laptop("i5", "4GB", "256GB", "white");
        laptop.printInfo();

    }
}

class Computer {
    private String cpu;
    private String memory;
    private String hardDisk;

    public Computer(String cpu, String memory, String hardDisk) {
        this.cpu = cpu;
        this.memory = memory;
        this.hardDisk = hardDisk;
    }

    public String getDetails() {
        return "Computer" +
                "  cpu='" + this.cpu + '\'' +
                ", memory='" + this.memory + '\'' +
                ", hardDisk='" + this.hardDisk + '\'';
    }
}

class Desktop extends Computer {
    private String motherboard;

    public Desktop(String cpu, String memory, String hardDisk, String motherboard) {
        super(cpu, memory, hardDisk);
        this.motherboard = motherboard;
    }

    public void printInfo() {
        System.out.println(this.getDetails() + ", motherboard='" + motherboard + "'");
    }

}

class Laptop extends Computer {
    private String color;

    public Laptop(String cpu, String memory, String hardDisk, String color) {
        super(cpu, memory, hardDisk);
        this.color = color;
    }

    public void printInfo() {
        System.out.println(this.getDetails()+ ", color='" + color + "'");
    }
}