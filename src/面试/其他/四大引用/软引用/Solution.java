package 面试.其他.四大引用.软引用;

import java.lang.ref.SoftReference;

public class Solution {
    public static void main(String[] args) {
        SoftReference<Byte[]> m = new SoftReference<>(new Byte[1024*1024*10]);
        Byte[] bytes = m.get();
        System.out.println(bytes.length);
        System.gc();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Byte[] x = m.get();
        System.out.println(x);
        byte[] b = new byte[1024*1024*15];
        System.out.println(m.get() );

    }
}
