package 面试.算法.leetcode.Q72编辑距离;

public class Solution {
    // leetcode 编辑距离的翻版
    public int minDistance(String s1, String s2) {
        int m = s1.length();
        int n = s2.length();
        int[][] dp = new int[m][n];
        for (int i = 0; i < m; i++) {
            dp[i][0] = i;
        }
        for (int i = 0; i < n; i++) {
            dp[0][i]=i;
        }
        for (int i = 1; i <m ; i++) {
            for (int j = 1; j < n; j++) {
                if(s1.charAt(i)==s2.charAt(j)){
                    dp[i][j]= Math.min(Math.min(dp[i-1][j],dp[i][j-1]),dp[i-1][j-1]-1)+1;
                }else {
                    dp[i][j]= Math.min(Math.min(dp[i-1][j],dp[i][j-1]),dp[i-1][j-1])+1;
                }
            }
        }
        return dp[m-1][n-1];

    }
}
