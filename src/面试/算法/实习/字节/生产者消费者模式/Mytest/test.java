package 面试.算法.实习.字节.生产者消费者模式.Mytest;

import java.util.concurrent.ArrayBlockingQueue;

public class test {
    public static void main(String[] args) {
        ArrayBlockingQueue<Integer> blockingQueue = new ArrayBlockingQueue<>(100);
        new Thread(new Consumer(blockingQueue),"线程1").start();
        new Thread(new Producer(blockingQueue),"线程2").start();
        new Thread(new Producer(blockingQueue),"线程3").start();
    }
}
