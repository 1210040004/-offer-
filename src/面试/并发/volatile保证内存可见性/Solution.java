package 面试.并发.volatile保证内存可见性;


import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

class Mydata{
    volatile int num= 0;
    public void add60(){
        this.num=60;
    }
    // 此时volatile 是加了volatile关键字的
    public  void addPlusPlus(){
        num++;
    }
    AtomicInteger atomicInteger= new AtomicInteger();
    public void addAtomic(){
        atomicInteger.getAndIncrement();
    }
}

/**
 * 验证volatile的可见性
 * 1.1 假如 int num =0 ； num变量之前没有添加volatile 关键字修饰
 * 1.2 添加了volatile可以解决可见性问题，验证volatile 不保证原子性问题
 *
 *  2 验证volatile 不保证原子性
 *  原子性指的是
 *   不可分割，完整性，也即某个线程正在做某个j具体业务的时候，中间不可以被加塞或者风
 *    需要同时成功，或者同时失败
 *    2.2 volatile 是否可以保证原子性
 * 2.4 如何保证原子性
 *    1 synchronized
 *    2 原子类
 *
 */
public class Solution {
    public static void main(String[] args) {
        Mydata mydata = new Mydata();
        for (int i = 0; i <20 ; i++) {
            new Thread(() -> {
                for (int j = 0; j < 1000; j++) {
                    mydata.addAtomic();
                }
            },String.valueOf(i)).start();
        }

        // 需要等待上面20个线程计算完成后，再用main 线程去查看结果只
        while(Thread.activeCount() > 2 ){
            Thread.yield();
        }
        System.out.println(mydata.atomicInteger);
    }

    private static void volatileTest2() {
        Mydata mydata = new Mydata();
        for (int i = 0; i <20 ; i++) {
            new Thread(() -> {
                for (int j = 0; j < 1000; j++) {
                    mydata.addPlusPlus();
                }
            },String.valueOf(i)).start();
        }

        // 需要等待上面20个线程计算完成后，再用main 线程去查看结果只
        while(Thread.activeCount() > 2 ){
            Thread.yield();
        }
        System.out.println(mydata.num);
    }


    private static void volatileTest() {
        Mydata mydata= new Mydata();
        new Thread(() ->{
            System.out.println(Thread.currentThread().getName()+"is comming");
             try{
                 TimeUnit.SECONDS.sleep(3);
             }catch (InterruptedException e){
                 e.printStackTrace();
             }
             mydata.add60();
            System.out.println(Thread.currentThread().getName()+"update number value"+mydata.num);
        },"AAA").start();
        // 第二个线程
        while(mydata.num==0){
            // main线程一致在这里等待循环直到num 值不等于0
        }
        // main 线程不可见 aaa 线程修改完以后main线程还在等待，还在循环等待。
        System.out.println(Thread.currentThread().getName()+"MISSION  IS OVCER");
    }
}
