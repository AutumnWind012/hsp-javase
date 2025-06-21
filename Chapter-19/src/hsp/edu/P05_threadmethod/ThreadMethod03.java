package hsp.edu.P05_threadmethod;

public class ThreadMethod03 {
    public static void main(String[] args) throws InterruptedException {
        //

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int j = 1; j <= 10; j++) {
                    System.out.println("hello " + j);
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                System.out.println("子线程结束 ...");
            }
        });

        for (int i = 1; i <= 10; i++) {
            System.out.println("hi " + i);
            if (i == 5) {
                // 启动子线程 t2
                t2.start();
                // 立即将 t2 插队
                t2.join();
            }
        }

        System.out.println("主线程结束 ...");
    }
}



