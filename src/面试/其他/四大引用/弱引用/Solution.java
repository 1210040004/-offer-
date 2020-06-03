package 面试.其他.四大引用.弱引用;

import 面试.其他.四大引用.M;

import javax.imageio.event.IIOWriteWarningListener;
import java.lang.ref.WeakReference;

public class Solution {
    public static void main(String[] args) {
        WeakReference<M> m = new WeakReference<>(new M() ) ;
        System.out.println(m.get());
        System.out.println("---------------");
        System.gc();
        System.out.println(m.get());
    }
}
