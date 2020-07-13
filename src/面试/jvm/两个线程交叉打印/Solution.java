package 面试.jvm.两个线程交叉打印;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

class print{
    ReentrantLock lock = new ReentrantLock();
    Condition c1 = lock.newCondition();
    Condition c2 = lock.newCondition();

    static  int i = 1 ;

    public  void printA() {
        while(i<=100)
            lock.lock();
            try{
                while(i%2==1) {
                    c1.await();
                }
                Thread.sleep(1000);
                System.out.println(i++);
            }catch (Exception e){

            }finally {
                lock.unlock();
                c2.signal();
            }
        }
    public  void printB() {
        while(i<=100)
            lock.lock();
        try{
            while(i%2!=0) {
                c2.await();
            }
            Thread.sleep(1000);
            System.out.println(i++);
        }catch (Exception e){

        }finally {
            lock.unlock();
            c1.signal();
        }
    }
    }

public class Solution {
    public static void main(String[] args) {
        print p = new print();
         new Thread(()->{
                p.printA();
         },"A线程").start();
        new Thread(()->{
            p.printB();
        },"B线程").start();
    }
}
