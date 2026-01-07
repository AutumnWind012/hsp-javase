package com.hspedu.P02_tryCatch;

public class TryCatch {
    public static void main(String[] args) {
        System.out.println("test方法返回 " + test2());
    }

    public static void tryCatch01() {
        try {
            String str = "Aaa";
            int a = Integer.parseInt(str);
            System.out.println("数字：" + a);
        } catch (NumberFormatException e) {
            System.out.println("异常信息=" + e.getMessage());
        } finally {
            System.out.println("执行finally代码块...");
        }
        System.out.println("程序继续 ...");
    }

    public static void tryCatch02() {
        try {
            String str = "123";
            int a = Integer.parseInt(str);
            System.out.println("数字：" + a);
        } catch (NumberFormatException e) {
            System.out.println("异常信息=" + e.getMessage());
        } finally {
            System.out.println("执行finally代码块...");
        }
        System.out.println("程序继续 ...");
    }

    public static void tryCatch03() {
        try {
            Person p = new Person();
            p = null;
            System.out.println(p.getName());
            int n1 = 10, n2 = 0;
            int res = n1 / n2;
        } catch (NullPointerException e) {
            System.out.println("捕获到空指针异常 ...");
        } catch (ArithmeticException e1) {
            System.out.println("捕获到算术异常 ...");
        } catch (RuntimeException e) {
            System.out.println("捕获到运行异常 ...");
        }

        System.out.println("程序继续 ...");
    }

    public static void tryCatch04() {
        try {
            Object o = new Person();
            Person person = (Person) o;
            System.out.println(person.getName());
            int n1 = 10, n2 = 0;
            int res = n1 / n2;
        } catch (NullPointerException | ClassCastException e) {
            System.out.println("捕获到Person对象异常 ...");
        } catch (ArithmeticException e) {
            System.out.println("捕获到算术异常 ...");
        }
        System.out.println("程序继续 ...");
    }

    public static void tryCatch05() {
        try {
            int n1 = 10, n2 = 0;
            int res = n1 / n2;
        } finally {
            System.out.println("执行finally代码块...");
        }
        System.out.println("程序继续 ...");
    }

    public static int test() {
        int i = 1;
        try {
            return i;
        } finally {
            ++i;
            System.out.println("i=" + i);
        }
    }

    static int test2() {
        try {
            return 1;
        } finally {
            // 不推荐
            return 2;
        }
    }
}


class Person {
    private String name = "jack";
    public String getName() {
        return name;
    }
}
