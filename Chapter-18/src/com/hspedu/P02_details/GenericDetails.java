package com.hspedu.P02_details;

import java.util.ArrayList;

public class GenericDetails {
    public static void main(String[] args) {
        //
        Gen<A> aGen = new Gen<A>(new A());
        aGen.f();
        // 可以接受 A 的子类型
        aGen = new Gen<A>(new B());
        aGen.f();


        ArrayList arrayList = new ArrayList();


    }
}



class A {}
class B extends A {}

class Gen<E> {
    E elem;
    public Gen(E elem) {
        this.elem = elem;
    }
    public void f() {
        System.out.println(elem.getClass());
    }
}