package 面试.算法.leetcode.Dp.九章算法.lintcode.Q110最小路径和;

public class Solution {
    /**
     * @param grid: a list of lists of integers
     * @return: An integer, minimizes the sum of all numbers along its path
     */
    public int minPathSum(int[][] grid) {
        return help(grid);
    }
    public int help(int[][] arr){
        int row = arr.length;
        int col = arr[0].length;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(i == 0 && j == 0){
                    continue;
                }
                if(i != 0 && j != 0){
                    arr[i][j] += Math.min(arr[i-1][j], arr[i][j-1]);
                }else if(i == 0){
                    arr[i][j] += arr[i][j-1];
                }else{
                    arr[i][j] += arr[i-1][j];
                }
            }
        }
        return arr[row-1][col-1];


    }
}