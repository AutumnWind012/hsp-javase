package com.hspedu.P01_intro;

public class GenericIntro {
    public static void main(String[] args) {

        Box<Double> box = new Box<>();
        box.setItem(5D);
        System.out.println(box.getItem());

    }
}


class Box<T> {
    // T 表示 item 的数据类型
    private T item;

    // T 也可以是参数类型
    public void setItem(T item) {
        this.item = item;
    }

    // T 也可以作为返回类型使用
    public T getItem() {
        return item;
    }
}
