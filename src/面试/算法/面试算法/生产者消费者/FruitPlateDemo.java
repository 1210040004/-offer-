//package 面试.算法.面试算法.生产者消费者;
//
//public class FruitPlateDemo {
//
//    private final static String LOCK = "lock";
//
//    private int count = 0;
//
//    private static final int FULL = 10;
//
//    public static void main(String[] args) {
//
//        FruitPlateDemo fruitDemo1 = new FruitPlateDemo();
//
//        for (int i = 1; i <= 5; i++) {
//            new Thread(fruitDemo1.new Producer(), "生产者-" + i).start();
//            new Thread(fruitDemo1.new Consumer(), "消费者-" + i).start();
//        }
//
//    }
//
//    class Producer implements Runnable {
//
//        @Override
//        public void run() {
//
//            for (int i = 0; i < 10; i++) {
//
//                try {
//                    Thread.sleep(300);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//
//                synchronized (LOCK) {
//
//                    while (count == FULL) {
//                        try {
//                            LOCK.wait();
//                        } catch (InterruptedException e) {
//                            e.printStackTrace();
//                        }
//                    }
//
//                    count++;
//                    System.out.println("生产者 " + Thread.currentThread().getName() + " 总共有 " + count + " 个资源");
//                    LOCK.notifyAll();
//
//                }
//
//            }
//
//        }
//
//    }
//
//    class Consumer implements Runnable {
//
//        @Override
//        public void run() {
//
//            for (int i = 0; i < 10; i++) {
//
//                try {
//                    Thread.sleep(300);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//
//                synchronized (LOCK) {
//
//                    while (count == 0) {
//                        try {
//                            LOCK.wait();
//                        } catch (InterruptedException e) {
//                            e.printStackTrace();
//                        }
//                    }
//
//                    count--;
//                    System.out.println("消费者 " + Thread.currentThread().getName() + " 总共有 " + count + " 个资源");
//                    LOCK.notifyAll();
//
//                }
//
//            }
//
//        }
//
//    }
//
//}