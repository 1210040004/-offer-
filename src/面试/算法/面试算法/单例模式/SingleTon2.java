package 面试.算法.面试算法.单例模式;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

public class SingleTon2 {
    private SingleTon2(){}
    private static SingleTon2 singleTon2;

    public  static SingleTon2 getInstance(){
        if (singleTon2==null){
            synchronized (SingleTon2.class){

                if (singleTon2==null){
                singleTon2 = new SingleTon2();
            }
        }
    }
        return singleTon2;

    }

    public static void main(String[] args) {
        Collection<Object> objects = Collections.synchronizedCollection(new ArrayList<>());

    }
}
