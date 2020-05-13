package 面试.算法.面试算法.线程池;

import java.util.concurrent.*;

public class ThreadPoolTest {
    /**
     * ThreadPoolExecutor.AbortPolicy:丢弃任务并抛出RejectedExecutionException异常。
     * ThreadPoolExecutor.DiscardPolicy：丢弃任务，但是不抛出异常。
     * ThreadPoolExecutor.DiscardOldestPolicy：丢弃队列最前面的任务，然后重新提交被拒绝的任务
     * ThreadPoolExecutor.CallerRunsPolicy：由调用线程（提交任务的线程）处理该任务
     * @param args
     */
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