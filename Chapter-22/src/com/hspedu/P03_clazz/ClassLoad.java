package com.hspedu.P03_clazz;

import java.lang.reflect.Method;
import java.util.Scanner;

public class ClassLoad {
    public static void main(String[] args) throws Exception {
        //
        Scanner scanner = new Scanner(System.in);
        String key = scanner.next();
        switch (key) {
            case "1":
                // 静态加载 Dog 类
//                Dog dog = new Dog();
                break;
            case "2":
                // 动态加载 Dog 类
                Class cls = Class.forName("Dog");
                Object o = cls.newInstance();
                Method method = cls.getMethod("hi");
                method.invoke(o);
                System.out.println("ok ....");
                break;
            default:
                System.out.println("do nothing ...");
                break;
        }
    }
}
