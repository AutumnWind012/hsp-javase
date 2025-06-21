package com.hspedu.P04_modifier;

public class A {
    public int n1 = 100;
    protected int n2 = 200;
    int n3 = 300;
    private int n4 = 400;

    public void m1(){}
    void m2(){};
    protected void m3(){};
    private void m4(){};

    void foo() {
        // 本类中可以访问全部修饰符
        System.out.println("n1=" + n1 + " n2=" + n2 + " n3=" + n3 + " n4=" + n4);
        // 成员方法的访问规则和属性完全一致
        m1();
        m2();
        m3();
        m4();
    }

}
