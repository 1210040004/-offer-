package 面试.并发.线程池;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;

public class myRejectHandler implements RejectedExecutionHandler {

    @Override
    public void rejectedExecution(Runnable r, ThreadPoolExecutor e) {
        System.out.println("已经满了");

        throw new RejectedExecutionException("Task " + r.toString() +
                " rejected from " +
                e.toString());
    }
}
