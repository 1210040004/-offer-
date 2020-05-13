package 面试.设计模式.单例模式;

public class SingleTon2 {
    private static class SingleTonHolder{
        private  static  final  SingleTon2  newInstance= new SingleTon2();
    }
    public SingleTon2() {
    }
    public  static  SingleTon2 getInstance(){
        return SingleTonHolder.newInstance;
    }
}
