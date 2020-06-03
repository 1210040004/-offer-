package 面试.算法.实习.字节.生产者消费者模式.Mytest;

import java.util.concurrent.ArrayBlockingQueue;

public class Consumer implements Runnable{
    ArrayBlockingQueue<Integer> blockingQueue;

    public Consumer(ArrayBlockingQueue<Integer> blockingQueue) {
        this.blockingQueue = blockingQueue;
    }

    @Override
    public void run() {
        // 消费者
        while(true){
            try {
                int  take = blockingQueue.take();
                System.out.println(Thread.currentThread().getName()+"正在消费"+take);
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
