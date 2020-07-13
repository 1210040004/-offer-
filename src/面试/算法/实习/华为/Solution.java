package 面试.算法.实习.华为;

import 面试.并发.Lock.AQS.CountDownLatchDemo;

import java.util.List;
import java.util.concurrent.CountDownLatch;

class Tree{
    int value ;
    Tree parent;
    List<Tree> child;

    public Tree(int value, List<Tree> child, Tree parent) {
        this.value = value;
        this.child = child;
        this.parent = parent;
    }
}
public class Solution {
    public List<Integer> terminateProcess(List<Integer> pid, List<Integer> ppid, int kill){
        int temp = 0 ;
        for (Integer integer : pid) {
            Integer parent = ppid.get(temp++);

        }
        return null;
    }
    static int i = 0;
    public static void main(String[] args) throws InterruptedException {
        CountDownLatch countDownLatch = new CountDownLatch(2);
            new Thread(()->{
                i++;
            },"线程1").start();

        countDownLatch.countDown();
            new Thread(()->{
                i++;
            },"线程2").start();
        countDownLatch.countDown();
        System.out.println("AB线程已经到达");
        System.out.println(i);
        countDownLatch.await();
        new Thread(()->{
            i++;
        },"线程3").start();
        Thread.sleep(100);
            System.out.println(i);
        System.out.println("线程3 已经++了");
    }
}
