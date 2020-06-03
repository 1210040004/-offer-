package 面试.并发.线程池;

public class ThreadDemo1 {
    public static void main(String[] args) {
        for (int i = 0; i < 300; i++) {
            Thread t = new Thread(new Runnable() {
                @Override
                public void run() {
                    while (true) {
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            });
            t.start();
        }
    }
}
