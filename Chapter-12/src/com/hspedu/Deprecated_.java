package com.hspedu;

/**
 * @author zijun
 * @date 2025/3/1
 */
public class Deprecated_ {
    public static void main(String[] args) {
        //
        A a = new A();
        System.out.println(a.n1);
    }
}


@Deprecated
class A {
    @Deprecated
    public int n1 = 10;
    @Deprecated
    public void hi() {}
}
