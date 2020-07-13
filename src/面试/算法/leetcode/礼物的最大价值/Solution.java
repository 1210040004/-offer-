package 面试.算法.leetcode.礼物的最大价值;

public class Solution {
    public int maxValue(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[][] f =new int[m][n];
        f[0][0] =grid[0][0];
        for (int i = 1; i < m; i++) {
            f[i][0]=f[i-1][0]+grid[i][0];
        }
        for (int i = 1; i < n; i++) {
            f[0][i] = f[0][i-1]+grid[0][i-1];
        }
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                f[i][j] =Math.max(f[i-1][j],f[i][j-1])+grid[i][j];
            }
        }
        return f[m-1][n-1];
    }
}
