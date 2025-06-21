package com.hspedu.P07_super;

public class Super01 {

    public static void main(String[] args) {

    }


}


class A {
    //4 个属性
    public int n1 = 100;
    protected int n2 = 200;
    int n3 = 300;
    private int n4 = 400;

    public A() {}

    public A(String name) {}

    public A(String name, int age) {}

    public void cal() {
        System.out.println("A 类的 cal() 方法...");
    }

    public void test100() {}

    protected void test200() {}

    void test300() {}

    private void test400() {}

}

class B extends A {
    // 访问父类的属性
    public void hi() {

        System.out.println(" " + super.n1 + super.n2 + super.n3);
    }
    // 调用父类方法
    public void ok() {
        super.test100();
        super.test200();
        super.test300();
    }
    // 调用父类构造器
    public B() {
        // super();
        // super("Elsa");
        super("Anna", 17);
    }
    // 调用父类方法
    public void sum() {
        System.out.println("B 类的 sum() 方法...");
        // 调用父类的 cal 有三种调用方法
        cal();
        this.cal();
        super.cal();
    }
}
