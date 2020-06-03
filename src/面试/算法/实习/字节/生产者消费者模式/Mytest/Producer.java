package 面试.算法.实习.字节.生产者消费者模式.Mytest;

import java.util.concurrent.ArrayBlockingQueue;

public class Producer  implements  Runnable{
    ArrayBlockingQueue blockingQueue ;

    public Producer(ArrayBlockingQueue blockingQueue) {
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
        }
    }
}
