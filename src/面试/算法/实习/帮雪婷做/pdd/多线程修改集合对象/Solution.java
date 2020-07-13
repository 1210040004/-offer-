package 面试.算法.实习.帮雪婷做.pdd.多线程修改集合对象;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


public class Solution {
    static  volatile ArrayList<Integer> list = new ArrayList<>();
    public static void main(String[] args) {
        list.add(1);
        list.add(2);
        list.add(3);
        Set<String> all = new HashSet<String>();
        all.add("hello");
        all.add("world");
        all.add("sina");
        all.add("sohu");
        Iterator<String> iter = all.iterator();
        while (iter.hasNext()) {
            String string = iter.next();
            System.out.println(string);
            all.remove("world");//删除当前的数据
        }
        System.out.println(all);
    }
}
