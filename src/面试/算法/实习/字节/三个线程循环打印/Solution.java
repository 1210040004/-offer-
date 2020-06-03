package 面试.算法.实习.字节.三个线程循环打印;

import sun.misc.Unsafe;

import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.AbstractQueuedSynchronizer;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

class RLock {
    ReentrantLock lock = new ReentrantLock();
    Condition c1 = lock.newCondition();
    Condition c2 = lock.newCondition();
    Condition c3 = lock.newCondition();
    volatile  int i = 1 ;

    public void printA(){
        for (int j = 1; j <= 10; j++) {
            try{
                lock.lock();
                while(i%3!=1){
                    c1.await();
                }
                System.out.println(Thread.currentThread().getName()+"正在打印第"+j+"个A");
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }finally {
                i++;
                c2.signal();
                lock.unlock();
            }
        }
    }
    public void printB(){
        for (int j = 1; j <= 10; j++) {
            try{
                lock.lock();
                while(i%3!=2){
                    c2.await();
                }
                System.out.println(Thread.currentThread().getName()+"正在打印第"+j+"个B");
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }finally {
                i++;
                c3.signal();
                lock.unlock();
            }
        }
    }
    public void printC(){
        for (int j = 1; j <= 10; j++) {
            try{
                lock.lock();
                while(i%3!=0){
                    c3.await();
                }
                System.out.println(Thread.currentThread().getName()+"正在打印第"+j+"个C");
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }finally {
                i++;
                c1.signal();
                lock.unlock();
            }
        }
    }

    public static void main(String[] args) {
        RLock lock = new RLock();
        new Thread(()->{
            lock.printA();
        },"线程1").start();
        new Thread(()->{
            lock.printB();
        },"线程2").start();
        new Thread(()->{
            lock.printC();
        },"线程3").start();
    }
}

public class Solution {
    public static void main(String[] args) {
        AtomicReference<String> ar = new AtomicReference<String>();
        ar.set("hello");
        //CAS操作更新
        ar.compareAndSet("hello", "hello1");
    }
}
