package 面试.算法.面试算法.工厂模式;

import java.util.concurrent.locks.ReentrantLock;

public class Solution {
        public static void main(String[] args) {
            Ticket ticket= new Ticket();
            new Thread(ticket,"T1").start();
            new Thread(ticket,"T2").start();
            new Thread(ticket,"T3").start();
            new Thread(ticket,"T4").start();

        }
        static class Ticket implements  Runnable{
             int ticket = 100;
             ReentrantLock lock = new ReentrantLock();
            @Override
            public void run() {
                while(true){
                    try{
                        lock.lock();
                        if (ticket <1 ) break;
                        System.out.println(Thread.currentThread().getName()+"正在售卖第"+ticket--+"张票");

                    }finally {
                        lock.unlock();
                    }
                }
            }
    }
}
