package hsp.edu.P05_threadmethod;

public class ThreadMethod02 {
    public static void main(String[] args) throws InterruptedException {
        T2 t2 = new T2();
        t2.start();

        for (int i = 1; i <= 5; i++) {
            Thread.sleep(100);
            System.out.println(Thread.currentThread().getName() + " 吃了 " + i + " 个包子");
            if (i == 2) {
                System.out.println(Thread.currentThread().getName() + " 礼让子线程");
                // 让 t2 线程先执行
                Thread.yield();
            }
        }
    }
}


class T2 extends Thread {

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(Thread.currentThread().getName() + " 吃了 " + i + " 个包子");
        }
    }
}
