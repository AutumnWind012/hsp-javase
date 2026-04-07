package com.hspedu;

public class String01 {



    public static void main(String[] args) {

        String str = "abc";

        String str1 = new String("original");

        String intern = str1.intern();
        String s = str.intern();

        System.out.println(intern == s);

        final char[] v1 = {'a', 'b', 'c'};
        v1[0] = 'h';    // 可以修改内容
        char[] v2 = {'t', 'o', 'm'};
        // v1 = v2;        // 不能修改指向



    }
}
