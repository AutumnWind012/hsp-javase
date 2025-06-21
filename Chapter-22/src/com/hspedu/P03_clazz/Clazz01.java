package com.hspedu.P03_clazz;

import com.hspedu.Car;

import java.lang.reflect.Field;

public class Clazz01 {
    public static void main(String[] args) throws Exception {
        //
//        String clazzPath = "com.hspedu.car";
        Class<?> clazz = Class.forName("com.hspedu.Car");
//
//        System.out.println(clazz);
//        System.out.println(clazz.getClass());

        Car car = (Car) clazz.newInstance();
        Field[] fields = clazz.getFields();
        for (Field field : fields) {
            // 输出字段内容
            System.out.println(field.get(car));
        }

    }
}
