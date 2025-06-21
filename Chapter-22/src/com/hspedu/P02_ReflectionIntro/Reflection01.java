package com.hspedu.P02_ReflectionIntro;

import com.hspedu.Cat;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Reflection01 {
    public static void main(String[] args) throws Exception {

        Cat cat = new Cat();
        System.out.println(cat.getClass());

        // 拿到 Cat 的实例对象
        Class<?> clazz = Class.forName("com.hspedu.Cat");
        Object o = clazz.getDeclaredConstructor().newInstance();
        Method method = clazz.getMethod("hi");
        System.out.println("====================== ");
        method.invoke(o);

        // 得到 name 字段
        Field nameField = clazz.getField("name");
        System.out.println(nameField.get(o));       // 通过传入对象拿到字段

        // 得到构造器
        // () 中可以指定构造器的参数类型，返回无参构造器
        Constructor<?> declaredConstructor = clazz.getDeclaredConstructor();
        System.out.println(declaredConstructor);


        Constructor<?> declaredConstructor1 = clazz.getDeclaredConstructor(String.class);
        System.out.println(declaredConstructor1);


    }
}
