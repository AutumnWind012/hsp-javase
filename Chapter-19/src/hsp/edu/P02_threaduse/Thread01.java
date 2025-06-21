package hsp.edu.P02_threaduse;

public class Thread01 {
    public static void main(String[] args) throws InterruptedException {
        //
        System.out.println("准备开启子线程");
        Cat cat = new Cat();
        cat.start();

        System.out.println("主线程继续执行");
        for (int i = 0; i < 100; i++) {
            System.out.println("主线程 i=" + i +
                    " 线程名称=" + Thread.currentThread().getName());
            Thread.sleep(1000);
        }

    }
}


class Cat extends Thread {

    int times = 0;

    @Override
    public void run() {
        // 在 run 方法中编写业务逻辑
        while (true) {
            System.out.println("喵喵，我是一只小猫咪 " + (++times) +
                    " 线程名称=" + Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            if (times == 100) break;
        }
    }
}