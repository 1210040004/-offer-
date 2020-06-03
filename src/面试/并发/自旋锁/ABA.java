package 面试.并发.自旋锁;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicStampedReference;

public class ABA {

    private static AtomicInteger atomicInteger = new AtomicInteger(100);
    private static AtomicStampedReference<Integer> atomicStampedReference = new AtomicStampedReference<Integer>(100, 0);

    public static void main(String[] args) {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                atomicInteger.compareAndSet(100, 101);
                atomicInteger.compareAndSet(101, 100);
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    TimeUnit.SECONDS.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                boolean flag = atomicInteger.compareAndSet(100, 102);
                System.out.println(flag);
            }
        });
        t1.start();
        t2.start();

        Thread t3 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    TimeUnit.SECONDS.sleep(1);
                } catch (InterruptedException e) {
                }
                atomicStampedReference.compareAndSet(100, 101, atomicStampedReference.getStamp(), atomicStampedReference.getStamp() + 1);
                atomicStampedReference.compareAndSet(101, 100, atomicStampedReference.getStamp(), atomicStampedReference.getStamp() + 1);
            }
        });

        Thread t4 = new Thread(new Runnable() {
            @Override
            public void run() {
                // 必须先取stamp,如果compareAndSet中第三个参数使用atomicStampedReference.getStamp();那就没有意义了
                int stamp = atomicStampedReference.getStamp();
                try {
                    TimeUnit.SECONDS.sleep(2);
                } catch (InterruptedException e) {
                }
                boolean flag = atomicStampedReference.compareAndSet(100, 101, stamp, stamp + 1);
                System.out.print("t3:" + flag);
            }
        });

        t3.start();
        t4.start();
        while (Thread.activeCount() > 1);
    }
}
