package 面试.算法.leetcode.Dp.九章算法.lintcode.Q513完美平方根;

public class Solution {
    public static int numSquares(int n) {
        // write your code here
        int[] f =new int[n+1];
        f[0]=0;
        for (int i = 1; i <=n ; i++) {
            int min = Integer.MAX_VALUE;
            int j = 1;
            while(i - j * j >= 0)
            {
                min = Math.min(min, f[i - j * j] + 1);
                j++;
            }
            f[i] = min;
        }
        return f[n];
    }

    public static void main(String[] args) {
        numSquares(12);
    }
}
