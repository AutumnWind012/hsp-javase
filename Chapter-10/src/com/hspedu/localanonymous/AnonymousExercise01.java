package com.hspedu.localanonymous;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AnonymousExercise01 {
    public static void main(String[] args) {
        f1( () -> System.out.println("这是一幅名画"));
        foo();
    }

    // 静态方法，形参试接口类型
    public static void f1(IL il) {
        il.show();
    }

    public static void foo() {
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


interface IL {
    void show();
}

class Photo implements IL {
    @Override
    public void show() {
        System.out.println("这是一张陈旧的相片");
    }
}