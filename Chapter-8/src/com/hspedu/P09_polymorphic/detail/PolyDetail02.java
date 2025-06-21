package com.hspedu.P09_polymorphic.detail;

public class PolyDetail02 {
    public static void main(String[] args) {
        // 向上转型
        Base base = new Sub();
        System.out.println(base.n1);
        System.out.println(new Sub().n1);

        BB bb = new BB();
        System.out.println(bb instanceof BB);
        System.out.println(bb instanceof AA);

        AA aa = new BB();
        System.out.println(aa instanceof BB);
        System.out.println(aa instanceof AA);

        Object object = "sd";

    }
}


class Base {
    int n1 = 10;
}

class Sub extends Base {
    int n1 = 20;
    public void foo() {
        System.out.println(super.n1);
    }
}

class AA{}
class BB extends AA{}
