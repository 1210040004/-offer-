package 面试.算法.leetcode.Q1277统计全为1的正方形子矩形;

public class Solution {
    public int countSquares(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        int[][] f= new int[row+1][col+1];

        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= col; j++) {
                if (matrix[i-1][j-1]==1){

                }
            }
        }
        return 0;

    }
}
