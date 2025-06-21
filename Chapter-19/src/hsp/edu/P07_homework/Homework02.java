package hsp.edu.P07_homework;

public class Homework02 {
    public static void main(String[] args) {
        //
        Withdrawn withdrawn = new Withdrawn();
        Thread A = new Thread(withdrawn);
        Thread B = new Thread(withdrawn);

        A.start();
        B.start();
    }
}


class Withdrawn implements Runnable {

    private double balance = 10000;

    @Override
    public void run() {
        while (balance >= 1000) {
            synchronized (this) {
                // 同一时刻只有一个线程可以取钱
                System.out.println(Thread.currentThread().getName()
                        + " 取走了 1000 元, 余额 = " + (balance-=1000));
            }
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println(Thread.currentThread().getName() + " 余额不足");
    }
}