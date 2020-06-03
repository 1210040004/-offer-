package 面试.并发.守护线程;

public class Soluition {
    public static void main(String[] args) {

        Thread t1 = new Thread(() -> {
            System.out.println("线程1");
        }, "t1");
        // 显示的设置为守护线程
        t1.setDaemon(true);
        t1.start();
    }
}
