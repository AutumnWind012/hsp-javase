package com.hspedu.P06_Extends.ExtendsDetail;

public class Sub extends Base{

    // 构造器
    public Sub() {
        // super();
        this("name");
        System.out.println("sub() ... 构造器");
    }

    //
    public Sub(String name){
        System.out.println("Sub(String name) ... 构造器");
    }

    public void sayOk() {
        // 非私有的属性和方法可以在子类直接访问
        System.out.println("" + n1 + n2 + n3);
        test100();
        test200();
        test300();

        // 私有属性和方法不能在子类访问，需要在父类提供 public 方法
        System.out.println(getN4());
        callTest400();

    }
}
