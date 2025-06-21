package com.hspedu.P02_ReflectionIntro;

import com.hspedu.Cat;

import java.lang.reflect.Method;

public class Reflection02 {
    public static void main(String[] args) throws Exception{
        // 普通方法
        foo();
        // 反射机制
        foo(true);
    }

    public static void foo() {

        Cat cat = new Cat();
        long start = System.currentTimeMillis();
        for (int i = 0; i < 90000000; i++) {
            cat.hi();
        }
        long end = System.currentTimeMillis();
        System.out.println("传统方法调用hi()，耗时 = " + (end - start));
    }

    // 反射机制调用
    public static void foo(boolean reflection) throws Exception {
        // 拿到 Class 类
        Class<?> clazz = Class.forName("com.hspedu.Cat");
        // 新建一个 Cat 对象实例
        Object o = clazz.getDeclaredConstructor().newInstance();
        // 得到一个 Method 实例
        Method hi = clazz.getMethod("hi");
        // 在反射调用方法是，取消访问检查
        hi.setAccessible(true);
        long start = System.currentTimeMillis();
        for (int i = 0; i < 90000000; i++) {
            // 使用反射机制调用 Cat 的 hi()
            hi.invoke(o);
        }
        long end = System.currentTimeMillis();
        System.out.println("反射机制调用hi()，耗时 = " + (end - start));
    }
}



