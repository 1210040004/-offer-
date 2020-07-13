package 面试.算法.leetcode.Q221最大正方形;

public class Solution1 {
    public int maximalSquare(char[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int[][] f = new int[m+1][n+1];
        int res = 0;
        for (int i = 1; i <=m; i++) {
            for (int j = 1; j <=n; j++) {
                if (matrix[i-1][j-1]=='1'){
                    f[i][j] = Math.min(Math.min(f[i-1][j],f[i][j-1]),f[i-1][j-1])+1;
                    res =Math.max(res,f[i][j]);
                }
            }
        }
        return res;
    }
}
