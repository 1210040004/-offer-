package 面试.并发.新建线程的方法.实现Runnalbe接口;

public class Solution {
    static class MyRunnable implements Runnable{

        @Override
        public void run() {
            System.out.println("1");
        }
    }

    public static void main(String[] args) {
        MyRunnable myRunnable = new MyRunnable();
        new Thread(myRunnable).start();
    }
}
