package com.hspedu.P02_EnumerationDetails;

/**
 * @author zijun
 * @date 2025/3/1
 */
public class EnumDetail {
    public static void main(String[] args) {
        Music.CLASSICAL.playing();
    }
}



class A {

}

interface IPlaying {
    void playing();
}

enum Music implements IPlaying {

    CLASSICAL, POP;

    @Override
    public void playing() {
        System.out.println("播放好听的音乐～～");
    }
}


enum Color {

   RED, GREEN, BLUE;

   public final byte depth = 8;

   public void foo() {
       System.out.println("foo 被 " + this.name() + " 调用");
   }

}