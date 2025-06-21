package com.hspedu.P07_interface;

public class InterfaceVsExtends {
    public static void main(String[] args) {
        //
        BabySwan babySwan = new BabySwan("小天鹅");
        babySwan.swimming();
        babySwan.flying();
    }
}



class Swan {
    protected String name;

    public Swan(String name) {
        this.name = name;
    }

    public void swimming() {
        System.out.println(name + "天生就会游泳");
    }
}

interface Flyable {
    void flying();
}

class BabySwan extends Swan implements Flyable{

    public BabySwan(String name) {
        super(name);
    }

    @Override
    public void flying() {
        System.out.println("通过学习" + super.name + "学会了飞行～");
    }
}



