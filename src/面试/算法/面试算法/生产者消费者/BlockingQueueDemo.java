package 面试.算法.面试算法.生产者消费者;

import java.util.concurrent.ArrayBlockingQueue;

public class BlockingQueueDemo {
    public static void main(String[] args) {
        ArrayBlockingQueue<String> blockingDeque= new ArrayBlockingQueue<String>(100);
        new Thread(new Producer(blockingDeque)).start();
        new Thread(new Producer(blockingDeque)).start();
        new Thread(new Producer(blockingDeque)).start();
        new Thread(new Consumer(blockingDeque)).start();

    }
}
