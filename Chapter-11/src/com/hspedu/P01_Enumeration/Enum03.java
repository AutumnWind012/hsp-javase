package com.hspedu.P01_Enumeration;

/**
 * @author zijun
 * @date 2025/2/28
 */
public class Enum03 {
    public static void main(String[] args) {
        System.out.println(Season.SPRING);


    }
}


enum Season {

    SPRING("春天", "温暖"),
    WINTER("冬天", "寒冷"),
    SUMMER("夏天", "炎热"),
    AUTUMN("秋天", "凉爽");

    private String name;
    private String desc;

    Season(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    @Override
    public String toString() {
        return "Season{" +
                "name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }
}

