package 面试.算法.面试算法.线程池;

import java.util.concurrent.*;

public class ThreadPoolTest {

    public static void main(String[] args) {

        BlockingQueue<Runnable> queue = new ArrayBlockingQueue<>(100);
        ThreadFactory factory = r -> new Thread(r, "test-thread-pool");
        ThreadPoolExecutor executor = new ThreadPoolExecutor(5, 5,
                0L, TimeUnit.SECONDS, queue, factory,new ThreadPoolExecutor.CallerRunsPolicy());
        while (true) {
            executor.submit(() -> {
                try {
                    System.out.println(queue.size());
                    Thread.sleep(10000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
        }
    }

}