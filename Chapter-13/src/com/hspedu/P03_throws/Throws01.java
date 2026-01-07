package com.hspedu.P03_throws;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Throws01 {

    public static void main(String[] args) throws FileNotFoundException {
        f1("hello");
    }

    // throws: 让 f1 的调用者来处理异常
    public static void f1(String filePath) throws FileNotFoundException {
        FileInputStream inputStream = new FileInputStream(filePath);
    }

    // throws：抛出异常的父类
    public void f2(String filePath) throws Exception {
        FileInputStream inputStream = new FileInputStream(filePath);
    }

    // throws: 抛出多个异常
    public void f3(String filePath) throws FileNotFoundException, NullPointerException {
        if (filePath.equals("file")) {
            FileInputStream inputStream = new FileInputStream(filePath);
        }
    }
}
