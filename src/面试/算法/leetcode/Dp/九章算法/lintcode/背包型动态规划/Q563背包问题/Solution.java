package 面试.算法.leetcode.Dp.九章算法.lintcode.背包型动态规划.Q563背包问题;

public class Solution {
    public int backPackV(int[] nums, int target) {
        // write your code here
        // 前n个物品有多少中方式拼出target
        // f[i][w]= 用前i个物品多少中方式拼出物品重量
        // f[i][w] =f[i-1][w]+f[i-1][w-Ai-1]
        // f[0][0]=1
        // f[0][i] =
        return 0;
    }
}
