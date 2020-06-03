package 面试.其他.四大引用;

public class M {
    @Override
    protected void finalize() throws Throwable {
        System.out.println("回收");
    }
}
