package 面试.volatile保证内存可见性;

public class T1 {
    volatile  int n = 0;

    public void add(){
        n++;
    }

    public static void main(String[] args) {

    }
}
