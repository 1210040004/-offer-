package 面试.算法.实习.字节.三个线程循环打印abc;

public class SleepExample extends Thread {
    private  static int count=0;

    private static int currentCount = 0;

    public SleepExample(String name) {
        this.setName(name);
    }

    @Override
    public void run() {
        while (currentCount < 30) {
            switch (currentCount % 3) {
                case 0:
                    if ("A".equals(getName())) {
                        printAndIncrease();
                    }
                    break;
                case 1:
                    if ("B".equals(getName())) {
                        printAndIncrease();
                    }
                    break;
                case 2:
                    if ("C".equals(getName())) {
                        printAndIncrease();
                    }
                    break;
            }
        }

    }

    private void printAndIncrease() {
        print();
        increase();
    }

    private void print() {
        System.out.println(getName());
        if ("C".equals(getName())) {
            System.out.println();
        }
    }

    private void increase() {
        currentCount++;
    }

    public static void main(String[] args) {
        new SleepExample("A").start();
        new SleepExample("B").start();
        new SleepExample("C").start();

    }
}
