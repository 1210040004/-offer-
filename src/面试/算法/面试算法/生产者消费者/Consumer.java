package 面试.算法.面试算法.生产者消费者;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingDeque;

public class Consumer  implements Runnable{
    private ArrayBlockingQueue<String> blockingDeque;

    public Consumer(ArrayBlockingQueue<String> blockingDeque) {
        this.blockingDeque = blockingDeque;
    }


    @Override
    public void run() {
        for (int i = 0; i < 100000; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            try {
                System.out.println("消费者线程"+Thread.currentThread().getName()+"消费物品"+blockingDeque.take());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
