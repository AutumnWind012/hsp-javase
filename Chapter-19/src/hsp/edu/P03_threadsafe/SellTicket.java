package hsp.edu.P03_threadsafe;


public class SellTicket {
    public static void main(String[] args) {
        //
        SyncTicketBooth booth = new SyncTicketBooth();
        Thread boothA = new Thread(booth);
        Thread boothB = new Thread(booth);
        Thread boothC = new Thread(booth);

        boothA.start();
        boothB.start();
        boothC.start();
    }
}

class SyncTicketBooth implements Runnable {

    // 让多个线程共享票数
    private int tickets = 100;

    // 在同一时刻，只能有一个线程可以执行 sell 方法
    public synchronized void sell() {
        System.out.println("窗口 " + Thread.currentThread().getName()
                + " 售出了一张票，剩余票数：" + (--tickets));
    }

    @Override
    public void run() {
        while (tickets > 0) {
            // 开始卖票
            sell();
            try {
                // 处理卖票订单需要时间
                Thread.sleep(20);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("票已售罄 ...");
    }
}