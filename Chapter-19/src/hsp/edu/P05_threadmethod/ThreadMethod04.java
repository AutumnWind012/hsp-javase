package hsp.edu.P05_threadmethod;

import java.sql.SQLOutput;

public class ThreadMethod04 {
    public static void main(String[] args) throws InterruptedException {

        MyDaemon myDaemon = new MyDaemon();
        Thread daemonThread = new Thread(myDaemon);
        // 设置为守护线程
        daemonThread.setDaemon(true);
        daemonThread.start();

        for (int i = 1; i <= 10; i++) {
            System.out.println("主线程正在执行 ... " + i);
            Thread.sleep(1000);
        }

        System.out.println("主线程执行结束");
    }
}



class MyDaemon implements Runnable {
    @Override
    public void run() {
        for (;;) {      // 无限循环
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(Thread.currentThread().getName() + "正在保护主线程 ...");
        }
    }
}
