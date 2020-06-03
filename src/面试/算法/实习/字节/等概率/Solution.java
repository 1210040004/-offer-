package 面试.算法.实习.字节.等概率;

import java.util.Random;

public class Solution {
    public static int get(){
        int i = new Random().nextInt(100);
        if (i<70){
            return 1;
        }else {
            return 0;
        }
    }
    public static int getother(){
        int i1 = get();
        int i2 = get();
        if (i1==0 && i2==1){
            return 1;
        }
        else if (i1==1 && i2==0){
            return 0;
        }
        return getother();
    }

    public static void main(String[] args) {
        int count0 = 0;
        int count1= 0;
        for (int i = 0; i < 1000000; i++) {
            int getother = getother();
            if (getother==0){
                count0++;
            }else{
                count1++;
            }
        }
        System.out.println(count0);
        System.out.println(count1);
    }
}

