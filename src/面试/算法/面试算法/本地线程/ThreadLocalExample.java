package 面试.算法.面试算法.本地线程;

import java.text.SimpleDateFormat;
import java.util.Random;
import java.util.TreeMap;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class ThreadLocalExample {
    public static void main(String[] args) {
        int x=1,y=2,z=3;
        y+=z--/++x;
        System.out.println(y);
    }


}
