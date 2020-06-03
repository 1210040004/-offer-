package 面试.算法.实习.字节.三个线程顺序打印字母;

import sun.misc.Unsafe;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class Solution {
    private static char c = 'A';
    private static int i = 0;
    public static void main(String[] args) throws InterruptedException {
        Runnable r = new Runnable() {
            public void run() {
                int threadId = Integer.parseInt(Thread.currentThread().getName());
                while(i < 26){
                    if(i % 3 == threadId - 1){
                        System.out.println("线程id：" + threadId + " " + (char)c++);
                        i++;
                        if(i == 26)
                            System.out.println("哈哈，祝拿到offer！");
                    }
                    try{
                        Thread.sleep(1000);
                    }catch(InterruptedException e){
                        e.printStackTrace();
                    }
                }
            }
        };
        Thread t1 = new Thread(r, "1");
        Thread t2 = new Thread(r, "2");
        Thread t3 = new Thread(r, "3");
        t1.start();
        t2.start();
        t3.start();
        Unsafe unsafe = Unsafe.getUnsafe();
//        unsafe.getAndAddInt();
        ArrayList list = new ArrayList(10);
    }
}
