package com.hspedu.P01_Exception;

import java.io.FileInputStream;
import java.io.IOException;

public class Exception01 {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 0;
        try {
            int res = num1 / num2;
        } catch (Exception e) {
            System.out.println("计算出错：" + e.getMessage());
        }
        System.out.println("程序持续运行...");
    }


    public static void loadFile() {
        try {
            FileInputStream fis = new FileInputStream("d:\\aa.jpg");
            System.out.println("文件加载成功！");
            fis.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
