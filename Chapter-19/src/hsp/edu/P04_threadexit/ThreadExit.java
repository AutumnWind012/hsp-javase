package hsp.edu.P04_threadexit;

public class ThreadExit {
    public static void main(String[] args) throws InterruptedException {
        //
        System.out.println(Thread.currentThread().getName() + " 线程正在执行");
        // 开启子线程
        A a = new A();
        a.start();
        // 通知子线程终止
        Thread.sleep(1000 * 5);
        a.setLoop(false);
    }
}



class A extends Thread {

    // 设置一个控制变量
    private boolean loop = true;
    private int count = 0;

    @Override
    public void run() {
        while (loop) {
            System.out.println(Thread.currentThread().getName() + " ... " + (++count));
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public void setLoop(boolean loop) {
        this.loop = loop;
    }
}
