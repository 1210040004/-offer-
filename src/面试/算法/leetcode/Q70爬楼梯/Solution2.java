package 面试.算法.leetcode.Q70爬楼梯;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Solution2 {
    public int climbStairs(int n) {
        if (n<=0){
            return 0;
        }
        if ( n==1 ){
            return 1;
        }
        if ( n==2 ){
            return 2;
        }
        int first = 1;
        int second = 2;
        int thrid = 0 ;
        for (int i = 3; i <= n ; i++) {
            thrid = first+second;
            first= second;
            second = thrid;
        }
        return thrid;
    }

}
