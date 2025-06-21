package com.hspedu.P03_clazz;

import java.io.Serializable;

public class ClazzElem {
    public static void main(String[] args) {

        // 类
        Class<String> stringClass = String.class;
        // 接口
        Class<Serializable> serializableClass = Serializable.class;
        // 数组
        Class<Integer[]> aClass = Integer[].class;
        Class<float[][]> aClass1 = float[][].class;
        // 注解
        Class<FunctionalInterface> interfaceClass = FunctionalInterface.class;
        // 枚举
        Class<Thread.State> stateClass = Thread.State.class;
        // void
        Class<Void> voidClass = void.class;
        // Class
        Class<Class> classClass = Class.class;
    }
}
