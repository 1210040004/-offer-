package 面试.并发.线程池;

import java.util.concurrent.*;

public class ThreadPoolDemo {
    //
    public static void main(String[] args) {
//        ExecutorService executorService = Executors.newCachedThreadPool();
//        for (int i = 0; i < 20; i++) {
//            executorService.execute(new Task());
//        }
//        ExecutorService executorService1 = Executors.newFixedThreadPool(20);
//        ExecutorService executorService2 = Executors.newSingleThreadExecutor();
        // 以上三种线程池创建参数，阿里是不让这样做的

        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(3);
        System.out.println(System.currentTimeMillis());
        scheduledExecutorService.schedule(new Runnable() {
            @Override
            public void run() {
                System.out.println("延迟3s执行");
                System.out.println(System.currentTimeMillis());
            }
        },3, TimeUnit.SECONDS  );
        scheduledExecutorService.shutdown();


    }
}
