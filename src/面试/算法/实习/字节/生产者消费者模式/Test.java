package 面试.算法.实习.字节.生产者消费者模式;

import java.util.concurrent.ArrayBlockingQueue;

public class Test {
//    class producer implements Runnable{
//        BlockingQueue<Integer> blockingQueue ;
//
//        public producer(BlockingQueue<Integer> blockingQueue) {
//            this.blockingQueue = blockingQueue;
//        }
//
//        @Override
//        public void run() {
//            for (int i = 0; i < 100; i++) {
//                try {
//                    blockingQueue.put(i);
//                    System.out.println(Thread.currentThread().getName()+"正在生产"+i);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//                try {
//                    Thread.sleep(5000);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            }
//        }
//    }
//    static class Consumer implements Runnable{
//        BlockingQueue<Integer> queue;
//
//        public Consumer(BlockingQueue<Integer> queue) {
//            this.queue = queue;
//        }
//
//        @Override
//        public void run() {
//            while(true){
//                try {
//                    Integer take = queue.take();
//                    System.out.println("线程"+Thread.currentThread().getName()+"正在消费"+take);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//                try {
//                    Thread.sleep(5000);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            }
//        }
//    }
    public void main(String[] args) {
        ArrayBlockingQueue<Integer> blockingQueue = new ArrayBlockingQueue<>(100);
        new Thread(new Consumer(blockingQueue),"消费者1").start();
        new Thread(new producer(blockingQueue),"生产者1").start();
        new Thread(new producer(blockingQueue),"生产者2").start();
    }
}
