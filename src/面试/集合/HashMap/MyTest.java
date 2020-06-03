package 面试.集合.HashMap;

import java.util.HashMap;
import java.util.TreeMap;

public class MyTest {

    public static void main(String[] args) {
        String s1= "programming";
        String s2= new String("programming");
        String s3= "program";
        String s4= "ming";
        String s5= "program"+"ming";
        String s6= s3+s4;
        System.out.println(s1==s2);
        System.out.println(s1==s5);
        System.out.println(s1==s6);
        System.out.println(s1==s6.intern());
        System.out.println(s2==s2.intern());


    }
}
