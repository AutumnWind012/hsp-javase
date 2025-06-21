package com.hspedu.P04_usegenerics;

public class GenericOnClass {
    public static void main(String[] args) {

    }
}



class Tiger<T,R,M> {
    String name;
    R r;
    M m;
    T t;
//    T[] tarr = new T[10];

    public Tiger(String name, R r, M m, T t) {
        this.name = name;
        this.r = r;
        this.m = m;
        this.t = t;
    }


    public M getM() {
        return m;
    }

    public void setM(M m) {
        this.m = m;
    }
}
