package hsp.edu.P02_threaduse;

public class Thread02 {
    public static void main(String[] args) {
        Tiger tiger = new Tiger();
        ThreadProxy threadProxy = new ThreadProxy(tiger);
        // 开启线程
        threadProxy.start();
    }
}



class Dog implements Runnable {

    int count;

    @Override
    public void run() {
        while (true) {
            System.out.println("小狗汪汪叫.. " + (++count) + " 线程名称 = "
                    + Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class ThreadProxy extends Thread implements Runnable {

    private Runnable target = null;

    @Override
    public void run() {
        if (target != null) {
            target.run();
        }
        System.out.println(Thread.currentThread().getName());
    }

    public ThreadProxy(Runnable target) {
        this.target = target;
    }

}

class Animal {}

class Tiger extends Animal implements Runnable {
    @Override
    public void run() {
        System.out.println("老虎嗷嗷叫 ..");
        System.out.println(Thread.currentThread().getName());
    }
}