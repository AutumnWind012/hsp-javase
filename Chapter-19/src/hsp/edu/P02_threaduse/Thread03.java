package hsp.edu.P02_threaduse;

public class Thread03 {
    public static void main(String[] args) {
        //
        for (int i = 0; i < 5; i++) {
            Thread thread = new Thread(new Runnable() {
                int count = 0;
                @Override
                public void run() {
                    while (true) {
                        System.out.println("Hello Java Concurrent!" + (++count) + " 线程名称 = "
                                + Thread.currentThread().getName());
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                        if (count >= 10) break;
                    }
                }
            });
            thread.start();
        }
    }
}


class T1 implements Runnable {
    int count = 0;
    @Override
    public void run() {
        while (true) {
            System.out.println("Hello Java Concurrent!" + (++count) + " 线程名称 = "
                    + Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            if (count >= 10) break;
        }
    }
}

class T2 implements Runnable {

    int count = 0;

    @Override
    public void run() {
        System.out.println("Hello Java Concurrent!" + (++count) + " 线程名称 = "
                + Thread.currentThread().getName());
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}