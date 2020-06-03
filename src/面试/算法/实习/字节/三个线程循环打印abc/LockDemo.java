package 面试.算法.实习.字节.三个线程循环打印abc;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockDemo {
    Lock lock = new ReentrantLock();
    Condition c1 = lock.newCondition();
    Condition c2 = lock.newCondition();
    Condition c3 = lock.newCondition();
    public static int i = 1 ;
    public  void  printA(){
        for (int j = 0; j < 10; j++) {
           lock.lock();
           try{
               while(i%3!=1){
                   c1.await();
               }
               System.out.println("线程1正在打印第"+j+"个A");
           } catch (InterruptedException e) {
               e.printStackTrace();
           }finally {
               i++;
               c2.signal();
               lock.unlock();
           }
        }
    }
    public  void  printB(){
        for (int j = 0; j < 10; j++) {
            lock.lock();
            try{
                while(i%3!=2){
                    c2.await();
                }
                System.out.println("线程2正在打印第"+j+"个B");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }finally {
                i++;
                c3.signal();
                lock.unlock();
            }
        }
    }
    public  void  printC(){
        for (int j = 0; j < 10; j++) {
            lock.lock();
            try{
                while(i%3!=0){
                    c3.await();
                }
                System.out.println("线程3正在打印第"+j+"个C");
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
        LockDemo demo = new LockDemo();
        new Thread(()->{
            demo.printA();
        },"线程1").start();
        new Thread(()->{
            demo.printB();
        },"线程2").start();
        new Thread(()->{
            demo.printC();
        },"线程3").start();
    }
}
