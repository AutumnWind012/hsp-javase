package com.hspedu.P05_genericswilcard;

import java.util.List;

public class GenericsWildcard {
    public static void main(String[] args) {



    }

    public static void printWithUpperBound(List<? extends AA> list) {
        for (Object object : list) {
            System.out.println(object);
        }
    }

    public static double sumOfList(List<? extends Number> list) {
        double sum = 0.0;
        for (Number num : list) {
            sum += num.doubleValue();
        }
        return sum;
    }


}



class AA {}

class BB extends AA {}

class CC extends BB {}
