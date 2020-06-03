package 面试.算法.leetcode.Q70爬楼梯;

import java.math.BigInteger;

public class Solution {
    public  static int climbStairs(int n) {
        if (n==1){
            return 1;
        }
        if (n==2){
            return 2;
        }
        int first = 1;
        int second = 2;
        int third = 0;
        for (int i = 3; i <=n ; i++) {
            third= first+second;
            first = second;
            second= third;
        }
        return third;
    }

    public static void main(String[] args) {
        System.out.println(climbStairs(4));
    }
}
