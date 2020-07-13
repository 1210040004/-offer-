package 面试.算法.leetcode.Q221最大正方形;

public class Solution2 {
    int res = 0;
    public int maximalSquare(char[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int[][] f = new int[m][n];
        f[0][0]=matrix[0][0]==0?0:1;
        for (int i = 1; i < m; i++) {
            f[i][0] = matrix[i][0]==0?0:1;
        }
        for (int i = 1; i <n ; i++) {
            f[0][i] = matrix[0][i] ==0?0:1;
        }
        for (int i = 1; i <m; i++) {
            for (int j = 1; j <n; j++) {
            }
        }
        return 1;
    }
}
