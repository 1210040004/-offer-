package 面试.算法.实习.字节.三个线程循环打印abc;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

class ReenLock{
    ReentrantLock lock = new ReentrantLock();
    Condition c1 =lock.newCondition();
    Condition c2 =lock.newCondition();
    Condition c3 =lock.newCondition();
    public  int i = 1 ;

    public void printA()  {
        for (int j = 1; j <= 10  ; j++) {
            lock.lock();
            try{
                while (i%3!=1){
                    c1.await();
                }
                System.out.println("线程1正在打印"+j+"个A");
                Thread.sleep(500);
            }catch (Exception e){

            }finally {
                i++;
                c2.signal();
                lock.unlock();
            }

        }
    }
    public void printB() {
        for (int j = 1; j <= 10  ; j++) {
            lock.lock();
            try{
                while (i%3!=2){
                    c2.await();
                }
                System.out.println("线程1正在打印"+j+"个B");
                Thread.sleep(500);
            }catch (Exception e){

            }finally {
                i++;
                c3.signal();
                lock.unlock();
            }

        }
    }
    public void printC()  {
        for (int j = 1; j <= 10  ; j++) {
            lock.lock();
            try{
                while (i%3!=0){
                    c3.await();
                }
                System.out.println("线程1正在打印"+j+"个C");
                Thread.sleep(500);
            }catch (Exception e){

            }finally {
                i++;
                c1.signal();
                lock.unlock();
            }
        }
    }

}
public class LockDemo2 {
    public static void main(String[] args) {
        ReenLock lock = new ReenLock();
        new Thread(()->{
            lock.printA();
        }).start();
        new Thread(()->{
            lock.printB();
        }).start();
        new Thread(()->{
            lock.printC();
        }).start();
    }
}
