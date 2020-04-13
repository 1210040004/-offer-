package 面试.算法.面试算法.平方数组成的数最少个数;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            int result = Calculate(i);
            System.out.print(result+" ");
            if (i%10==0){
                System.out.println();
            }
        }
    }

    private static int Calculate(int n) {
        // 给定一个正数n, 用不大于n的平方数去相加， 可以等于n， 求t的最小值
        double sqrt = Math.sqrt(n);
        if ((sqrt-(int)sqrt) == 0){
            return 1;
        }
        if (n==1){
            return 1;
        }
        if (n==2){
            return 2;
        }
        if (n==3){
            return 3;
        }
        // 否则的话一定是由其他的平方数构成的，不行可以是凑1 凑起来的
        int[] f= new int[n+1];
        f[0]=0;
        f[1]=1;
        f[2]=2;
        f[3]=3;
        for (int i = 4; i <= n; i++) {
            f[i] = Integer.MAX_VALUE;
            if (isSqrt(i)){
                f[i]=1;
            }else {
                for (int j = 1; j < i; j++) {
                    f[i]=Math.min(f[j]+f[i-j],f[i]);
                }
            }
        }
        return f[n];
    }

    private static boolean isSqrt(int i) {
        double sqrt = Math.sqrt(i);
        if ((sqrt-(int)sqrt) == 0){
            return true;
        }
        return false;
    }
}
