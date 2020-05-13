package 面试.算法.leetcode.Dp.九章算法.lintcode.Q110最小路径和;

public class Solution2 {
    public int minPathSum(int[][] a) {
        // write your code here
        // 最小路径和
        int m = a.length;
        int n = a[0].length;
        int[][] f = new int[m][n];
        f[0][0] = a[0][0];
        for (int i = 1; i < m; i++) {
            f[i][0] = f[i - 1][0] + a[i][0];
        }
        for (int i = 0; i < n; i++) {
            f[0][i] =f[0][i-1] +a[0][i];
        }
        for (int i = 1; i < m; i++) {
            for (int j =1 ; j < n; j++) {
                f[i][j]=Math.min(f[i-1][j],f[i][j-1])+a[i][j];
            }
        }
        return f[m-1][n-1];
    }
}
