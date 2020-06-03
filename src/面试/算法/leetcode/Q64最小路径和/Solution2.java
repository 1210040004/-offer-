package 面试.算法.leetcode.Q64最小路径和;

public class Solution2 {
    public  static int minPathSum(int[][] grid) {
        // 最小路径和
        int m = grid.length;
        int n = grid[0].length;
        if (grid==null || m==0 || n==0){
            throw  new RuntimeException("错误数据");
        }
        int[][] f= new int[m][n];
        f[0][0] = grid[0][0];
        for (int i = 1; i < m; i++) {
            f[i][0] = f[i-1][0]+grid[i][0];
        }
        for (int i = 1; i < n; i++) {
            f[0][i] = f[0][i-1]+grid[0][i];
        }
        for (int i = 1; i < m; i++) {
            for (int j = 1; j <n ; j++) {
                f[i][j] = Math.min(f[i-1][j],f[i][j-1])+grid[i][j];
            }
        }
        return f[m-1][n-1];
    }

    public static void main(String[] args) {

    }
}
