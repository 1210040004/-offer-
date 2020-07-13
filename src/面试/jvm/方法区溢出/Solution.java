package 面试.jvm.方法区溢出;

import java.util.ArrayList;
import java.util.List;

public class Solution {
     static  class  oom{
         int[] arr = new int[1024*1024];
     }
    public static void main(String[] args) {
        List<oom> list = new ArrayList<>();
        while(true){
            list.add(new oom());
        }
    }
}
