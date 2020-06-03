package 面试.算法.实习.字节.生产者消费者模式;

import java.util.concurrent.BlockingQueue;

public class producer implements Runnable{
    BlockingQueue<Integer> blockingQueue ;

    public producer(BlockingQueue<Integer> blockingQueue) {
        this.blockingQueue = blockingQueue;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            try {
                blockingQueue.put(i);
                System.out.println(Thread.currentThread().getName()+"正在生产"+i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
