package com.hspedu.P05_genericswilcard;


import java.util.ArrayList;
import java.util.List;

public class GenericsExtends {
    public static void main(String[] args) {
        ArrayList<Object> list0 = new ArrayList<>(10);
        ArrayList<Number> list1 = new ArrayList<>(10);
        addNumbers(list0);
        addNumbers(list1);
    }

    public static void addNumbers(List<? super Integer> list) {
        for (int i = 1; i <= 10; i++) {
            list.add(i);
        }
    }

}

class A<T> {}
class B<R> extends A<R>{}


class TA {}
class TB extends TA{}