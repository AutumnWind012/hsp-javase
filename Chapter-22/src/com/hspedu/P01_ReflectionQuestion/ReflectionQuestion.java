package com.hspedu.P01_ReflectionQuestion;

import java.io.FileInputStream;
import java.lang.reflect.Method;
import java.util.Properties;

public class ReflectionQuestion {
    public static void main(String[] args) throws Exception {
        //
        Properties properties = new Properties();

        properties.load(new FileInputStream("Chapter-22/src/re.properties"));
        // 拿到类全路径
        String classfullpath = properties.get("classfullpath").toString();
        // 拿到方法名称
        String methodName = properties.get("method").toString();


        // 3. 使用反射
        // 3.1 加载类，返回 Class 对象
        Class<?> clazz = Class.forName(classfullpath);
        // 3.2 通过 clazz 得到加载的类 com.hspedu.Cat 的对象实例
        Object o = clazz.getDeclaredConstructor().newInstance();
        // 检查 o 的运行类型
        System.out.println(o.getClass());       // class com.hspedu.Cat
        // 3.3 通过 clazz 拿到加载类中的 methodName 方法对象
        Method method = clazz.getMethod(methodName);
        // 注意在反射机制中，可以把方法也视为一个对象，即万物皆对象
        // 3.4 通过方法对象实现调用方法，传入反射创建的对象实例
        System.out.println("====================== ");
        method.invoke(o);
    }
}
