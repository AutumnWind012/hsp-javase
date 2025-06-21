package com.hspedu.P04_usegenerics;

public class GenericsOnInterface {

    public static void main(String[] args) {

    }
}


interface IUsb<U, R> {
    R get(U u);

    void hi(R r);

    void run(R r1, R r2, U u1, U u2);

    default R method(U u) {
        return null;
    }

}

class Usb implements IUsb {
    @Override
    public Object get(Object o) {
        return null;
    }

    @Override
    public void hi(Object o) {

    }

    @Override
    public void run(Object r1, Object r2, Object u1, Object u2) {

    }
}


interface IA extends IUsb<String, Double> {
    @Override
    Double get(String s);

    @Override
    void hi(Double aDouble);

    @Override
    void run(Double r1, Double r2, String u1, String u2);

    @Override
    default Double method(String s) {
        return IUsb.super.method(s);
    }
}