package 面试.并发.线程池;

import java.sql.Time;
import java.util.concurrent.*;

public class myThreadPoolDemo {
    public static void main(String[] args) {
        ThreadPoolExecutor ex = new ThreadPoolExecutor(2,
                3,
                60,
                TimeUnit.SECONDS,
                new ArrayBlockingQueue<Runnable>(5),
                Executors.defaultThreadFactory(),
                new myRejectHandler());
        for (int i = 0; i < 9; i++) {
            ex.execute(new Task());
        }
    }
}
