package 面试.算法.面试算法.生产者消费者.生产者消费者2;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicStampedReference;

public class Demo {
    public static void main(String[] args) {
        ArrayBlockingQueue<String> blockingQueue = new ArrayBlockingQueue<>(100);
        new Thread(new Consumer(blockingQueue)).start();
        new Thread(new Producer(blockingQueue)).start();
        new Thread(new Producer(blockingQueue)).start();
        new Thread(new Producer(blockingQueue)).start();
        AtomicStampedReference atomicStampedReference = new AtomicStampedReference(1,0);
    }
}
