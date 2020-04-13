package 面试.算法.实习.美团.留下的总共的烙印;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        long magic = sc.nextLong();
        long[] val = new long[n];
        long circleValu = 0;
        for (int i = 0; i < val.length; i++) {
            val[i] =  sc.nextInt();
            circleValu+=val[i];
        }

        long circleTime = magic / circleValu;
        long lastCircleVal = magic % circleValu;
        long count = 0;
        for (int i = 0; i < n; i++) {
            if(lastCircleVal>=val[i]){
                lastCircleVal-=val[i];
                count++;
            }
        }
        System.out.println(circleTime*n+count);
    }
}
