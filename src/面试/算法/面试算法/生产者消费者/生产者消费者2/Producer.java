package 面试.算法.面试算法.生产者消费者.生产者消费者2;

import java.util.concurrent.ArrayBlockingQueue;

public class Producer implements  Runnable{
    ArrayBlockingQueue<String> blockingQueue;

    public Producer(ArrayBlockingQueue<String> blockingQueue) {
        this.blockingQueue = blockingQueue;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            try {
                blockingQueue.put("正在生产"+i);
                System.out.println(Thread.currentThread().getName()+"正在生产线程"+i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
