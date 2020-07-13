package 面试.算法.leetcode.Q718最长重复子数组;

/**
 * 给两个整数数组 A 和 B ，返回两个数组中公共的、长度最长的子数组的长度。
 *
 * 示例 1:
 *
 * 输入:
 * A: [1,2,3,2,1]
 * B: [3,2,1,4,7]
 * 输出: 3
 * 解释:
 * 长度最长的公共子数组是 [3, 2, 1]。
 *
 */
public class Solution {
    public int findLength(int[] A, int[] B) {
        int max = 0 ;
        int[] f = new int[B.length+1];
        for (int i = 1; i <= A.length; i++) {
            for (int j = B.length; j >= 1 ; j--) {
                if (A[i-1] == B[j-1]){
                    f[j] = f[j-1]+1;
                }else {
                    f[j] = 0;
                }
                max = Math.max(max,f[j]);
            }
        }
        return max;
    }
    public int findLength2(int[] A, int[] B) {
        int max = 0;
        int[] dp = new int[B.length + 1];
        for (int i = 1; i <= A.length; i++) {
            for (int j = B.length; j >= 1; j--) {
                if (A[i - 1] == B[j - 1])
                    dp[j] = dp[j - 1] + 1;
                else
                    dp[j] = 0;
                max = Math.max(max, dp[j]);
            }
        }
        return max;
    }
}
