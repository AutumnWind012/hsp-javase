package com.hspedu.localanonymous;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AnonymousInnerClass {
    public static void main(String[] args) {
        new Outer().foo();
    }

    static void example() {
        JFrame frame = new JFrame("Anonymous Inner Class Example");
        JButton button = new JButton("Click Me");

        // 使用匿名内部类实现事件监听器
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Button clicked!");
            }
        });

        frame.add(button);
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}




class Outer {
    private int n1 = 10;
    public void foo() {
        Hello hello = new Hello("你好！") {
            @Override
            public void greetings() {
                System.out.println(greet + "我是 Hello 的匿名内部类。");
            }
        };
        hello.greetings();
    }
}

class Hello {
    protected String greet;
    public Hello(String greet) {
        this.greet = greet;
    }
    public void greetings() {
        System.out.println(greet + "我是 Hello 类。");
    }
}

interface Animal {
    public void makeSound();
}

class Tiger implements Animal {
    @Override
    public void makeSound() {
        System.out.println("rawr rawr");
    }
}

class Duck implements Animal {
    @Override
    public void makeSound() {
        System.out.println("quack quack");
    }
}

class Sheep implements Animal {
    @Override
    public void makeSound() {
        System.out.println("baa baa");
    }
}

abstract class Bird {
    abstract void fly();
}