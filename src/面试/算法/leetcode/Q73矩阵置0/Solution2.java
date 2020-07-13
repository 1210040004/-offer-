package 面试.算法.leetcode.Q73矩阵置0;

public class Solution2 {
    public void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int[] f = new int[m];
        int[] t = new int[n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j]==0) {
                    f[i] = 0;
                    t[j] = 0;
                }
            }
        }
        for (int i = 0; i < f.length; i++) {
            if (f[i]==0){
                for (int j = 0; j < n; j++) {
                    matrix[i][j] = 0;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            if (t[i] == 0){
                for (int j = 0; j < m; j++) {
                    matrix[i][j] = 0;
                }
            }
        }
    }
}
