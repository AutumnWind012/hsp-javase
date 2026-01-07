package com.hspedu.P01_Exception;

public class Exception03 {
    public static void main(String[] args) {
        try {
            foo();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void foo() {
        try {
            throw new RuntimeException("抛出异常");
        } finally {
            System.out.println("finally正在执行 ...");
        }
    }
}
