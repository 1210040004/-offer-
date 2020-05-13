package 面试.并发.新建线程的方法.实现Callable接口;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class Solution {
    static  class myCallable implements Callable<Integer>{

        @Override
        public Integer call() throws Exception {
            return 1;
        }
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        myCallable myCallable = new myCallable();
        FutureTask<Integer> fu = new FutureTask<>(myCallable);
        Thread thread = new Thread(fu);
        thread.start();
       // System.out.println(fu.get());
    }
}
