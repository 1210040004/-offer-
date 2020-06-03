package 面试.算法.实习.字节.三个线程循环打印abc;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class Rlock{
    ReentrantLock lock = new ReentrantLock();
    Condition c1 =lock.newCondition();
    Condition c2 =lock.newCondition();
    Condition c3 =lock.newCondition();
    public static volatile  int i =1 ;

    public void printA(){
        for (int j = 1; j <= 10; j++) {
                lock.lock();
                try {
                    while (i%3!=1) {
                        c1.await();
                    }
                    System.out.println(Thread.currentThread().getName()+"线程正在打印"+j);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                finally {
                    i++;
                    c2.signal();
                    lock.unlock();
                }
        }
    }

    public void printB(){
        for (int j = 1; j <= 10; j++) {
                lock.lock();
                try {
                    while (i%3!=2){
                    c2.await();
                    }
                    System.out.println(Thread.currentThread().getName()+"线程正在打印"+j);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                finally {
                    i++;
                    c3.signal();
                    lock.unlock();
                }
        }
    }

    public void printC(){
        for (int j = 1; j <= 10; j++) {
                lock.lock();
                try {
                    while (i%3!=0){
                        c3.await();
                    }
                    System.out.println(Thread.currentThread().getName()+"线程正在打印"+j);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                finally {
                    i++;
                    c1.signal();
                    lock.unlock();
                }
            }
    }
    public static void main(String[] args) {
        Rlock rlock = new Rlock();
        new Thread(()->{
            rlock.printA();
        },"打印A").start();

        new Thread(()->{
            rlock.printB();
        },"打印B").start();

        new Thread(()->{
            rlock.printC();
        },"打印C").start();
    }
}

