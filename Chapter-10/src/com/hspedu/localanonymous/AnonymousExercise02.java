package com.hspedu.localanonymous;

public class AnonymousExercise02 {
    public static void main(String[] args) {
        //
        new CellPhone().alarmClock(new Bell() {
            @Override
            public void ring() {
                System.out.println("小懒猪起床了！");
            }
        });

        new CellPhone().alarmClock(() -> System.out.println("小伙伴上课了"));
    }
}


interface Bell {
    void ring();
}

class CellPhone {
    public void alarmClock(Bell bell) {
        bell.ring();
    }
}

