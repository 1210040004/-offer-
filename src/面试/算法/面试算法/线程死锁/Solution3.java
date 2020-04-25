package 面试.算法.面试算法.线程死锁;

import java.util.concurrent.locks.ReentrantLock;

public class Solution3 {
    private  static  Object ob1 = new Object();
    private  static  Object ob2 = new Object();

    public static void main(String[] args) {
        ReentrantLock lock = new ReentrantLock();
        new Thread(() -> {

            synchronized (ob1){
                System.out.println("Thread1  waitting to get resource 1");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Thread1 get resources1");
                synchronized (ob2){
                    System.out.println("Thread1  waitting to get resource 2");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("Thread1 get resources2");
                }
            }

        },"Thread 1").start();
        new Thread(() -> {

            synchronized (ob2){
                System.out.println("Thread2  waitting to get resource 2");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Thread2 get resources2");
                synchronized (ob1){
                    System.out.println("Thread2  waitting to get resource 1");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("Thread2 get resources1");
                }
            }

        },"Thread 2").start();
    }
}
