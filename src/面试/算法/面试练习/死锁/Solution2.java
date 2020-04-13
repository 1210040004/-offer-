package 面试.算法.面试练习.死锁;

public class Solution2 {
  private  static Object object1 = new Object();
  private  static Object object2 = new Object();

    public static void main(String[] args) {
        new Thread(()->{
                synchronized (object1){
                    System.out.println("线程1得到了资源1 ");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {

                    }
                    System.out.println("线程1 等待线程2");
                    synchronized (object2){
                        System.out.println("线程1得到了线程2");
                    }
            }
        },"线程1").start();
        new Thread(()->{

                synchronized (object1){
                    System.out.println("线程2得到了资源2 ");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {

                    }
                    System.out.println("线程2 等待线程1");
                    synchronized (object2){
                        System.out.println("线程2得到了线程1");
                    }
                }

        },"线程2").start();
    }

}
