package 面试.并发.SynchronizedDemo;

import java.util.HashMap;
import java.util.Hashtable;

public class NoVisibility {
    private static boolean ready = false;
    private static int number = 0;

    private static class ReaderThread extends Thread {
        @Override
        public void run() {
            while (!ready) {
                Thread.yield(); //交出CPU让其它线程工作
            }
            System.out.println(number);
        }
    }

    public static void main(String[] args) {
        HashMap<String, String> table=  new HashMap<>();
        table.put(null,"123");
        table.put(null,null);

        String s = table.get(null);
        System.out.println("-----");
        System.out.println(s);
        System.out.println("------");

    }
}
