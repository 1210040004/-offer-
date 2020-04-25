package 面试.并发.Lock.AQS;

import java.util.concurrent.locks.LockSupport;
import java.util.concurrent.locks.ReentrantLock;

public class Test {
   static ReentrantLock lock = new ReentrantLock();

    public static void main(String[] args) {
        Thread t1 = new Thread(){
            @Override
            public void run() {
                testsync();
            }
        };
        t1.setName("t1");


        Thread t2 = new Thread(){
            @Override
            public void run() {
                testsync();
            }
        };
        t2.setName("t2");

        // 说明几乎是同时进行的
        t1.start();
        t2.start();

       // System.out.println("main");
    }
    // 既然有synchronized 为什么需要 reentrentLcok

    /**
     * 先有synchronized 关键字再有reentrentlock
     *  1.6 以前的synchronized 实现同步是一种重量级的锁， 会去调用操作系统的函数，
     *  1.7 以后尽量减少调用系统
     */
    public static void testsync(){
        LockSupport.park();
        lock.lock();
        System.out.println(Thread.currentThread().getName());
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }
}
