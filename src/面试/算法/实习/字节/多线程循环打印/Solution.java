package 面试.算法.实习.字节.多线程循环打印;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

class RLock{
    private int num =1;
    private ReentrantLock lock = new ReentrantLock();
    Condition c1 = lock.newCondition();
    Condition c2 = lock.newCondition();
    Condition c3 = lock.newCondition();

    public RLock() {
    }

    public void print5(){
        lock.lock();
        try{
            while(num!=1){
               c1.await();
            }
            for (int i = 0; i < 5; i++) {
                System.out.println(Thread.currentThread().getName()+"正在打印"+i);
            }
            num=2;
            c2.signal();
        } catch (InterruptedException e) {
        }
        finally {

            lock.unlock();
        }
    }
    public void print10(){
        lock.lock();
        try{
            while(num!=2){
                c2.await();
            }
            for (int i = 0; i < 5; i++) {
                System.out.println(Thread.currentThread().getName()+"正在打印"+i);
            }
            num=3;
            c3.signal();
        } catch (InterruptedException e) {
        }
        finally {
            lock.unlock();
        }
    }
    public void print15(){
        lock.lock();
        try{
            while(num!=3){
                c3.await();
            }
            for (int i = 0; i < 5; i++) {
                System.out.println(Thread.currentThread().getName()+"正在打印"+i);
            }
            num=1;
            c3.signal();
        } catch (InterruptedException e) {
        }
        finally {
            lock.unlock();
        }
    }
}
public class Solution {
    public static void main(String[] args) {
        RLock l = new RLock();
        new Thread(()->{
            for (int i = 0; i < 10; i++) {
                  l.print5();
            }
        },"A").start();
        new Thread(()->{
            for (int i = 0; i < 10; i++) {
                l.print10();
            }
        },"B").start();
        new Thread(()->{
            for (int i = 0; i < 10; i++) {
                l.print15();
            }
        },"C").start();
    }
}
