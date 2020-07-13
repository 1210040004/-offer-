package 面试.算法.leetcode.Q221最大正方形;

public class Solution {
    public int maximalSquare(char[][] matrix) {
        int rows = matrix.length, cols = rows > 0 ? matrix[0].length : 0;

        int[][] f= new int[rows+1][cols+1];
        int max = 0;
        for(int i =1 ;i<=rows;i++){
            for(int j =1;j<=cols;j++){
                if(matrix[i-1][j-1]=='1'){
                    f[i][j] = Math.min(Math.min(f[i][j - 1], f[i - 1][j]), f[i - 1][j - 1]) + 1;
                    max =Math.max(f[i][j],max);
                }
            }
        }
        return max*max;
    }
}
