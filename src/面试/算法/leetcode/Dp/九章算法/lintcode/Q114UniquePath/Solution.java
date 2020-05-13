package 面试.算法.leetcode.Dp.九章算法.lintcode.Q114UniquePath;

public class Solution {
    public int uniquePaths(int m, int n) {
        // write your code here
        int[][] f = new int[m][n];
        if(m==0 && n==0){
            return 0;
        }
        for (int i = 0; i < m; i++) {
            f[i][0] = 0;
        }
        for (int i = 0; i < n; i++) {
            f[0][i] = 0;
        }
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                f[i][j]=f[i-1][j]+f[i][j-1];
            }
        }
        return f[m-1][n-1];
    }
}
