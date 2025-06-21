package com.hspedu.P03_codeblock;

public class CodeBlockDetails {
    public static void main(String[] args) {
        //
        System.out.println(DD.n1);
    }
}



class AA extends BB {
    static {
        System.out.println("AA 类被加载");
    }
}

class BB {
    static {
        System.out.println("BB 类被加载");
    }
}


class CC {
    public static int n1 = 9999;

    static {
        System.out.println("CC 类被加载");
    }
}

class DD {
    static int n1;
    static {
        System.out.println("DD 的静态代码块被执行 ... ");
    }
    {
        System.out.println("DD 的普通代码块被执行");
    }
}


class Cat extends Animal {
    public static String name = "加菲猫";
    static {
        System.out.println("Cat 类被加载");
    }
}

class Animal {
    static {
        System.out.println("Animal 类被加载");
    }
}
