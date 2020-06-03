package 面试.算法.实习.帮雪婷做.pdd.多线程修改集合对象;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    static  volatile ArrayList<Integer> list = new ArrayList<>();
    public static void main(String[] args) {
        list.add(1);
        list.add(2);
        list.add(3);
        new Thread(()->{
            list.add(1);
        },"线程1").start();
        new Thread(()->{
            list.remove(1);
        },"线程2").start();
        Map<Integer, Integer> integerIntegerMap = Collections.synchronizedMap(new HashMap<Integer, Integer>());

    }
}
