package com.hspedu.P05_final;

import java.util.ArrayList;
import java.util.List;

public class Final01 {
    public static void main(String[] args) {
        System.out.println(BBB.num);
        System.out.println(Example.NAMES);
    }
}


class AA {
    public void cal() {
        System.out.println("cal() 方法被调用");
    }
}

class BB extends AA {
    @Override
    public void cal() {
        System.out.println("方法被重写");;
    }
}


class E {
    public final double TAX_RATE;
    {
        TAX_RATE = 0.12;
    }
}

class F {
    public static final double PI;
    static {
        PI = 3.1415;
    }
}



//class BBB {
//    public final static int num = 100;
//    public final static void foo() {
//        System.out.println("hello");
//    }
//    static {
//        System.out.println("正在加载 BBB，static 代码块被执行 ...");
//    }
//}

class BBB {
    public final static int num = 100;
    static {
        System.out.println("正在加载 BBB，static 代码块被执行 ...");
    }
}

class Example {
    public static final String NAMES = "Java";

    static {
        System.out.println("static 代码块被执行 ...");
    }
}
