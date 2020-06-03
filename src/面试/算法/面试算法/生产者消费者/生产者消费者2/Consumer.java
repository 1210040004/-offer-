package 面试.算法.面试算法.生产者消费者.生产者消费者2;

import java.util.concurrent.ArrayBlockingQueue;

public class Consumer  implements  Runnable{
    ArrayBlockingQueue<String> blockingQueue ;

    public Consumer(ArrayBlockingQueue<String> blockingQueue) {
        this.blockingQueue = blockingQueue;
    }

    @Override
    public void run() {
        while(true){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            try {
                String take = blockingQueue.take();
                System.out.println(Thread.currentThread().getName()+"正在消费"+take);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
