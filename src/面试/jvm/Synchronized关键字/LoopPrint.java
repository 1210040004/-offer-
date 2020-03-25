package 面试.jvm.Synchronized关键字;

import jdk.nashorn.internal.ir.Block;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 *  多线程之间按照顺序调用，实现A-b-c 三个线程启动，要求：
 *  aa 打印5次  bb 打印10次  cc打印15次
 *  aa 打印5次  bb 打印10次  cc打印15次
 *  aa 打印5次  bb 打印10次  cc打印15次
 *  。。。。。。
 *  十轮
 */

class ShareResource{
    private int number =1 ;// A :1 ， B2 ，C3
    private Lock lock = new ReentrantLock();
    private Condition c1 = lock.newCondition();
    private Condition c2 = lock.newCondition();
    private Condition c3 = lock.newCondition();

    public  void print5(){
        lock.lock();
        try{
            while(number!=1){
                c1.await();
            }
            for (int i = 1; i <= 5; i++) {
                System.out.println(Thread.currentThread().getName()+"\t"+number);
            }
            // 通知
            number = 2 ;
            c2.signal();
        }
        catch (Exception e){

        }
        finally {
            lock.unlock();
        }
    }
    //1 判断
    // 2 干活
    //3

    public  void print10(){
        lock.lock();
        try{
            while(number!=2){
                c2.await();
            }
            for (int i = 1; i <= 10; i++) {
                System.out.println(Thread.currentThread().getName()+"\t"+number);
            }
            // 通知
            number= 3;
            c3.signal();
        }
        catch (Exception e){

        }
        finally {
            lock.unlock();
        }
    }

    public  void print15(){
        lock.lock();
        try{
            while(number!=3){
                c3.await();
            }
            for (int i = 1; i <= 15; i++) {
                System.out.println(Thread.currentThread().getName()+"\t"+number);
            }
            // 通知
            number=1;
            c1.signal();
        }
        catch (Exception e){

        }
        finally {
            lock.unlock();
        }
    }

}
public class LoopPrint {
    public static void main(String[] args) {
        ShareResource shareResource = new ShareResource();
        new Thread(()->{
            for (int i = 0; i <10 ; i++) {
                shareResource.print5();
            }
        },"A").start();
        new Thread(()->{
            for (int i = 0; i <10 ; i++) {
                shareResource.print10();
            }
        },"B").start();
        new Thread(()->{
            for (int i = 0; i <10 ; i++) {
                shareResource.print15();
            }
        },"C").start();
    }
}
