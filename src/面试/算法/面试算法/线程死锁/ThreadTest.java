package 面试.算法.面试算法.线程死锁;

public class ThreadTest
{
    public static void main(String[] args)
    {
        new Thread(new Thread1()).start();
        new Thread(new Thread2()).start();
    }
}