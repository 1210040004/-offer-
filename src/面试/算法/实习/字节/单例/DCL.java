package 面试.算法.实习.字节.单例;

public class DCL {
    private volatile static DCL instance;

    private DCL() {
    }
    public static DCL getInstance(){
        if (instance==null){
            synchronized (DCL.class){
                if (instance == null){
                    instance = new DCL();
                }
            }
        }
        return instance;
    }
}
