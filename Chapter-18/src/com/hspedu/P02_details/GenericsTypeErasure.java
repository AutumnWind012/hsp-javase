//package com.hspedu.P02_details;
//
//import java.util.List;
//
//public class GenericsTypeErasure {
//    public static void main(String[] args) {
//        Box<String> stringBox = new Box<>();
//        stringBox.setItem("Secret");
//        String value = stringBox.getItem();
//    }
//
//    public static <T> void genericMethod(T param) {
//        // 编译错误：Cannot perform instanceof check against parameterized type
//        if (param instanceof List<String>) { /* ... */ }
//    }
//
//}
//
//
//class Box<T> {
//    private T item;
//
//    public void setItem(T item) {
//        this.item = item;
//    }
//
//    public T getItem() {
//        return item;
//    }
//
//    public T[] createItems() {
//        return new T[10];
//    }
//}
//
//class OverloadConflict {
//    // 以下两个方法无法共存，编译时会报重复方法错误
//    public void process(List<Integer> items) { /* ... */ }
//    public void process(List<String> items) { /* ... */ }
//}