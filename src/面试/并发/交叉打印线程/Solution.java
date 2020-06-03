package 面试.并发.交叉打印线程;

import java.util.concurrent.locks.LockSupport;

/**
 * 两个线程， 一个输出字母， 一个输出汉字，交替输出1A2B3C4D......26Z
 */
public class Solution {
    static  Thread t1 = null;
    static Thread t2 =null;
    static volatile int num = 1;
    static volatile  char c='1';
    public static void main(String[] args) {
        t1 =  new Thread(()->{
            while (num<=9){
                System.out.print(num++);
                LockSupport.unpark(t2);
                LockSupport.park();
            }

        },"t1");
        t2 =  new Thread(()->{
            while (c<='Z'){
                System.out.print(c++);
                LockSupport.unpark(t1);
                LockSupport.park();
            }

        },"t2");
        t1.start();
        t2.start();
    }
}
