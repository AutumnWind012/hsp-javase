package hsp.edu.P05_threadmethod;

public class ThreadMethod {
    public static void main(String[] args) throws InterruptedException {
        A a = new A();
        // 设置名称
        a.setName("老韩");
        // 设置优先级
        a.setPriority(Thread.MIN_PRIORITY);
        a.start();
        // 获取名称
        System.out.println(a.getName());

        // 主线程
        Thread.sleep(5000);
        System.out.println("触发中断");
        a.interrupt();
        System.out.println(a.isInterrupted());

        Thread.yield();

    }
}


class A extends Thread {
    private int count = 0;

    @Override
    public void run() {
        while (true) {
            for (int i = 0; i < 5; i++) {
                System.out.println(Thread.currentThread().getName() + "吃包子~~~~" + (++count));
            }
            try {
                System.out.println(Thread.currentThread().getName() + "休眠中~~~~");
                Thread.sleep(20000);
            } catch (InterruptedException e) {
                // 当该线程执行到一个 interrupt 时，会抛出一个异常
                // InterruptedException 捕获到了一个中断异常
                System.out.println(Thread.currentThread().getName() + "被中断了");
            }
        }
    }
}
