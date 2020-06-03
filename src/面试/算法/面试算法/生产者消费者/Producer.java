package 面试.算法.面试算法.生产者消费者;

import java.util.concurrent.ArrayBlockingQueue;
public class Producer  implements  Runnable{
    private ArrayBlockingQueue<String> blockingDeque;

    public Producer(ArrayBlockingQueue<String> blockingDeque) {
        this.blockingDeque = blockingDeque;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            try {
                blockingDeque.put(Thread.currentThread().getName()+"-"+i);
                System.out.println("生产者线程"+Thread.currentThread().getName()+"生产物品"+Thread.currentThread().getName()+i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
