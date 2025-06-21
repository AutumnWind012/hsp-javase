package com.hspedu.P08_override;

import java.util.*;

public class Override01 {
    public static void main(String[] args) {
        //
        Child child = new Child();
        child.sayGoodbye();

        HashMap<String, Object> hashMap = new HashMap<>();
        String time = null;

        for (int i = 0; i < 23; ++i) {

        }


    }
}


class Parent {
    String sayGoodbye() {
        System.out.println("goodbye");
        return null;
    }
}

class Child extends Parent {
    private String sayGoodbye(int a) {
        return null;
    }
}


