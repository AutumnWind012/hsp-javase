package com.hspedu.P03_clazz;

import com.hspedu.Car;

public class GetClazz {

    public static void main(String[] args) throws ClassNotFoundException {
        //
        String classPath = "com.hspedu.Car";
        Class<?> clazz = Class.forName(classPath);
        System.out.println(clazz);

        Class<Car> clazz2 = Car.class;
        System.out.println(clazz2);

        Car car = new Car();
        System.out.println(car.getClass());

        ClassLoader classLoader = car.getClass().getClassLoader();
        Class<?> clazz3 = classLoader.loadClass(classPath);
        System.out.println(clazz3);

        Class<Integer> integerClass = int.class;
        System.out.println(integerClass);
        Class<Boolean> booleanClass = boolean.class;
        System.out.println(booleanClass);


        Class<Integer> type = Integer.TYPE;
        System.out.println(type);
        Class<Double> type1 = Double.TYPE;
        System.out.println(type1);

        System.out.println(integerClass.hashCode() == type.hashCode());

    }
}
