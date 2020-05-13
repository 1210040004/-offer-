package 面试.算法.leetcode.Dp.九章算法.lintcode.Q669CoinChange;

public class Solution {
    public int coinChange(int[] A, int M) {
        // write your code here
        int[] f= new int[M+1];
        int n=A.length;// 硬币的种类
        // 总价为0的时候，当然是0种
        f[0]=0;
        int i,j;
        for ( i = 1; i<=M; ++i) {
            // 先置为最大值
            f[i]=Integer.MAX_VALUE;
//            last coin A[j]
//            f[i]=min{f[i-A[0]]+1,....,f[i-A[n-1]]+1}
            for ( j = 0; j < n; j++) {
                if(i>=A[j]&&f[i-A[j]]!=Integer.MAX_VALUE){
                    f[i]=Math.min(f[i-A[j]]+1,f[i]);
                }
            }
        }
        if(f[M]==Integer.MAX_VALUE){
            f[M]=-1;
        }
        return f[M];
    }
}
