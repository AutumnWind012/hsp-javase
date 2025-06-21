package hsp.edu.P06_deadlock;

public class DeadLock_ {
    public static void main(String[] args) {
        //
        DeadLockDemo threadA = new DeadLockDemo(true);
        DeadLockDemo threadB = new DeadLockDemo(false);

        threadA.start();
        threadB.start();

        // 阻塞 ...

    }
}


class DeadLockDemo extends Thread {
    // 共享资源类变量
    private static final Object o1 = new Object();
    private static final Object o2 = new Object();
    boolean flag;

    public DeadLockDemo(boolean flag) {
        this.flag = flag;
    }

    @Override
    public void run() {
        if (flag) {
            synchronized (o1) {
                System.out.println(Thread.currentThread().getName() + " 进入 1");
                synchronized (o2) {
                    System.out.println(Thread.currentThread().getName() + " 进入 2");
                }
            }
        } else {
            synchronized (o2) {
                System.out.println(Thread.currentThread().getName() + " 进入 3");
                synchronized (o1) {
                    System.out.println(Thread.currentThread().getName() + " 进入 4");
                }
            }

        }
    }
}

