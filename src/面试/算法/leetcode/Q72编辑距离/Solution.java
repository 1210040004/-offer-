package 面试.算法.leetcode.Q72编辑距离;

public class Solution {
    public int minDistance(String word1, String word2) {
        int m = word1.length();
        int n = word2.length();
        int[][] dp = new int[m][n];
        for (int i = 0; i < m; i++) {
            dp[i][0] = i;
        }
        for (int i = 0; i < n; i++) {
            dp[0][i]=i;
        }
        for (int i = 1; i <m ; i++) {
            for (int j = 1; j < n; j++) {
                if(word1.charAt(i)==word2.charAt(j)){
                    dp[i][j]= Math.min(Math.min(dp[i-1][j],dp[i][j-1]),dp[i-1][j-1]-1)+1;
                }else {
                    dp[i][j]= Math.min(Math.min(dp[i-1][j],dp[i][j-1]),dp[i-1][j-1])+1;
                }
            }
        }
        return dp[m-1][n-1];
    }
}
