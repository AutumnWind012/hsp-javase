package com.hspedu;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zijun
 * @date 2025/3/1
 */

public class SuppressWarnings_ {

    public static void main(String[] args) {
        //

        List list = new ArrayList();

        @SuppressWarnings("all")
        list.add("jack");


        @SuppressWarnings("unused")
        int i = 0;

    }

    public void m1() {
        List list = new ArrayList();
        list.add("jack");
    }

    static {
        List list = new ArrayList();
        list.add("jack");
    }
}

class B {

}
