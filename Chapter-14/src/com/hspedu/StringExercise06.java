package com.hspedu;

public class StringExercise06 {

    String str = new String("hsp");
    final char[] ch = {'j', 'a', 'v', 'a'};

    public void change(String str, char[] ch) {
        str = "java";
        ch[0] = 'h';
    }

    public static void main(String[] args) {
        StringExercise06 exercise06 = new StringExercise06();
        exercise06.change(exercise06.str, exercise06.ch);

        //
        System.out.print(exercise06.str + " and ");
        System.out.println(exercise06.ch);

    }
}
