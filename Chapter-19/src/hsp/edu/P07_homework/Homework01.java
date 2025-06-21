package hsp.edu.P07_homework;

import java.util.Scanner;

public class Homework01 {
    public static void main(String[] args) {
        ThreadX printer = new ThreadX();
        ThreadXListener listener = new ThreadXListener(printer);

        printer.start();
        listener.start();
    }
}


class ThreadX extends Thread {

    private boolean loop = true;

    public void setLoop(boolean loop) {
        this.loop = loop;
    }

    @Override
    public void run() {
        while (loop) {
            System.out.println((int)(Math.random() * 100) + 1);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class ThreadXListener extends Thread {

    public static final Scanner scanner = new Scanner(System.in);

    private final ThreadX threadX;

    public ThreadXListener(ThreadX threadX) {
        this.threadX = threadX;
    }

    @Override
    public void run() {
        while (true) {
            System.out.println("请输入指令(Q)表示退出：");
            char key = scanner.next().toUpperCase().charAt(0);
            if (key == 'Q') {
                threadX.setLoop(false);
                System.out.println("任务结束，线程退出 ...");
                break;
            }
        }
    }
}
