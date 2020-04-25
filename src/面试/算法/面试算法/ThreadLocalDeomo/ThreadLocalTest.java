package 面试.算法.面试算法.ThreadLocalDeomo;

/**
 * 每个线程自身的存储区域 局部区域
 * 三个常用方法 get set initialValue
 */
public class ThreadLocalTest {
    private static  ThreadLocal<Integer> threadLocal= new ThreadLocal<Integer>(){
        @Override
        protected Integer initialValue() {
            return 200;
        }
    };
    private static  ThreadLocal<Integer> threadLocal2= ThreadLocal.withInitial(()->200);

    //

    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName()+ "  "+ threadLocal.get());
        threadLocal.set(300);
        System.out.println(Thread.currentThread().getName()+ "  "+ threadLocal.get());
        for (int i = 0; i < 5; i++) {
            new Thread(new MyRun()).start();
        }
    }

    public static class MyRun implements  Runnable{
        @Override
        public void run() {
            System.out.println(Thread.currentThread().getName()+ "  "+ threadLocal.get());
            threadLocal.set((int)(Math.random()*99));
            System.out.println(Thread.currentThread().getName()+ "  "+ threadLocal.get());
        }
    }
}
