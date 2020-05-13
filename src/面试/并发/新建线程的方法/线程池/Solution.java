package 面试.并发.新建线程的方法.线程池;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.LockSupport;

import 面试.并发.新建线程的方法.实现Runnalbe接口.MyRunnable;

public class Solution {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();
        for (int i = 0; i < 5; i++) {
            executorService.execute(new MyRunnable());
        }
        executorService.shutdown();
    }
}
