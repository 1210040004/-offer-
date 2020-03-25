package 面试.设计模式.单例模式;

/**
 *  双重检索的单例模式
 */
public class SingleTon {
    public volatile  static SingleTon singleTon;
    private SingleTon(){}
    public static SingleTon getInstance(){
        if (singleTon==null){
            synchronized (SingleTon.class){
                if (singleTon==null){
                    singleTon= new SingleTon();
                }
            }
        }
        return singleTon;
    }
}
