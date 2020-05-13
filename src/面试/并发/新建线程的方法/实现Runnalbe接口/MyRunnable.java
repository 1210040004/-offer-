package 面试.并发.新建线程的方法.实现Runnalbe接口;

public class MyRunnable implements Runnable{
    @Override
    public void run() {
        System.out.println(1);
    }
}
