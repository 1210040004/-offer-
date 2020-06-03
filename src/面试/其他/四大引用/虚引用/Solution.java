package 面试.其他.四大引用.虚引用;

import 面试.其他.四大引用.M;

import java.lang.ref.PhantomReference;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.LinkedList;
import java.util.List;

public class Solution {
    private static  final List<Object> LIST = new LinkedList<>();
    private static  final ReferenceQueue<M> QUEUE = new ReferenceQueue<>();

    public static void main(String[] args) {
        // new 出来以后非常虚的指向一个对象，会放进去一个队列
        // 凡是虚引用指向的对象，在回收的时候会放进一个队列里面，
        // 回收分成两部，
        // 1 放入队列
        // 2 对队列进行回收

        PhantomReference<M> phantomReference = new PhantomReference<>(new M(),QUEUE);
        System.out.println(phantomReference.get());

        new Thread(()->{
            while(true){{
                LIST.add(new byte[1024*1024]);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(phantomReference.get());
            }}
        }).start();

        new Thread(()->{
            while(true){
                Reference<? extends M> poll = QUEUE.poll();
                if (poll!=null){
                    System.out.println("被回收了"+poll);
                }
            }
        }).start();
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
