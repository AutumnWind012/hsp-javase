package com.hspedu.P04_Homework;

public class Homework08 {
    public static void main(String[] args) {
        Color red = Color.RED;
        red.show();
        matchColor(red);
    }

    public static void matchColor(Color color) {
        switch (color) {
            case RED:
                System.out.println("匹配到红色");
                break;
            case BLACK:
                System.out.println("匹配到黑色");
                break;
            case BLUE:
                System.out.println("匹配到蓝色");
                break;
            case GREEN:
                System.out.println("匹配到绿色");
                break;
            case YELLOW:
                System.out.println("匹配到黄色");
                break;
            default:
                System.out.println("没有匹配到颜色");
                break;
        }
    }
}

interface IColor {
    void show();
}

enum Color implements IColor{
    RED(255, 0, 0),
    BLUE(0, 0, 255),
    BLACK(0, 0, 0),
    YELLOW(255, 255, 0),
    GREEN(0, 255, 0);

    private int redValue;
    private int greenValue;
    private int blueValue;

    Color(int redValue, int greenValue, int blueValue) {
        this.redValue = redValue;
        this.greenValue = greenValue;
        this.blueValue = blueValue;
    }

    @Override
    public void show() {
        System.out.println("RGB Values: " + redValue + ", " + greenValue + ", " + blueValue);
    }
}
