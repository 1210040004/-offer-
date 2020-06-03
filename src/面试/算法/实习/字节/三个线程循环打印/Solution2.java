package 面试.算法.实习.字节.三个线程循环打印;


import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

class Rlock{
    ReentrantLock lock = new ReentrantLock();
    Condition c1 =lock.newCondition();
    Condition c2 =lock.newCondition();
    Condition c3 =lock.newCondition();
    volatile  int i = 1;


    public void printA() throws InterruptedException {
        for (int j = 1; j <= 10; j++) {
            lock.lock();
            while (i%1!=1){
                c1.await();
            }
            System.out.println(Thread.currentThread().getName()+"正在打印");
        }
    }

}
public class Solution2 {

}
