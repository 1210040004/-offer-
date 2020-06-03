package 面试.并发.交叉打印线程;

import java.util.concurrent.locks.LockSupport;

public class Solution2 {
    static  Thread t1 = null;
    static Thread t2 =null;
    static volatile  int c=1;
    public static void main(String[] args) {
        synchronized (Solution2.class) {

            t1 = new Thread(() -> {
                while (c <= 9) {
                    System.out.println(Thread.currentThread().getName() + c++);
                    LockSupport.unpark(t2);
                    LockSupport.park();
                }

            }, "t1");
            t2 = new Thread(() -> {
                while (c <= 10) {
                    System.out.println(Thread.currentThread().getName() + c++);
                    LockSupport.unpark(t1);
                    LockSupport.park();
                }

            }, "t2");
        }
        t1.setPriority(10);
        t1.start();
        t2.start();
    }
}
