package 面试.算法.leetcode.Q329矩阵中最长递增路径;

public class Solution {
    int res  = 1;
    public int longestIncreasingPath(int[][] matrix) {
        // DFS
        int m = matrix.length;
        int n = matrix[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                findPath(matrix,matrix[i][j],i,j,1);
            }
        }
        return res;
    }

    private void findPath(int[][] matrix, int cop, int i, int j, int length) {
        if (i<0 || i>=matrix.length || j<0 || j>=matrix[0].length){
            return;
        }
        if (i>=1 && matrix[i-1][j]>cop){
        }
        return ;
    }
}
