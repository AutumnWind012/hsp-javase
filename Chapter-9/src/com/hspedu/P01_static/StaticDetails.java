package com.hspedu.P01_static;

import java.time.LocalDateTime;

public class StaticDetails {

    public static void main(String[] args) {
        System.out.println(C.msg);

        System.out.println(MyTool.toCelsius(0));
    }
}



class C {
    public static String msg = "北京2025";
}


class MyTool {

    private MyTool(){};

    public static double toCelsius(double kelvin) {
        return kelvin - 273.15;
    }

}
