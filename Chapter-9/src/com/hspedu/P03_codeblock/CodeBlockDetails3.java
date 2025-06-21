package com.hspedu.P03_codeblock;

public class CodeBlockDetails3 {
    public static void main(String[] args) {
        new BBB();
    }
}

class AAA {
    {
        System.out.println("AAA 普通代码块被调用 ...");
    }
    public AAA() {
        // (2) super();
        // (3) 执行本类普通代码块
        // (4) 执行AAA构造器
        System.out.println("AAA() 构造器被调用 ...");
    }
}

class BBB extends AAA {
    {
        System.out.println("BBB 普通代码块被调用 ...");
    }
    public BBB() {
        // (1) super();
        // (5) 调用本类普通代码块
        // (6) 执行BBB构造方法
        System.out.println("BBB() 构造器被调用 ...");
    }
}


