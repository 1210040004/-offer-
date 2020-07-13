package 面试.算法.leetcode.Q63不同路径;

public class Solution2 {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        if (obstacleGrid[0][0] == 1 ){
            return 0;
        }
        int[][] f = new int[m][n];
        for (int i = 0; i < m; i++) {
           if (obstacleGrid[i][0] == 0){
               f[i][0] = 1;
           }

        }
        for (int i = 1; i < n; i++) {
            f[0][i] = (obstacleGrid[0][i]==0 && obstacleGrid[0][i-1]==1)?1:0;
        }
        return 1;
    }
}
