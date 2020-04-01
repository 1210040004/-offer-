package 面试.算法.面试练习;

public class Solution {
    public static void main(String[] args) {
        Source source =new Source();
        new Thread(source,"T1").start();
        new Thread(source,"T2").start();
        new Thread(source,"T3").start();
    }
}
class Source implements Runnable{
    static  volatile  int num =100;
    @Override
    public void run() {
        while(true){
            synchronized (this){

            if (num<1)break;
            System.out.println(Thread.currentThread().getName()+"正在打印第"+num--+"张票");

            }
        }
    }
}
