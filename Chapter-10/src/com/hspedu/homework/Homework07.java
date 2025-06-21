package com.hspedu.homework;

public class Homework07 {
    public static void main(String[] args) {
        //
        Car carA = new Car(35);
        carA.getAir().flow();

        Car carB = new Car(55);
        carB.getAir().flow();

        Car carC = new Car(-10);
        carC.getAir().flow();

    }
}


class Car {

    private double temperature;

    public Car(double temperature) {
        this.temperature = temperature;
    }

    class AirConditioner {
        public void flow() {
            if (temperature > 40) {
                System.out.println("空调正在吹冷风～");
            } else if (temperature < 0) {
                System.out.println("空调正在吹暖风～");
            } else {
                System.out.println("温度正常，关闭空调");
            }
        }
    }

    public AirConditioner getAir() {
        return new AirConditioner();
    }

}
