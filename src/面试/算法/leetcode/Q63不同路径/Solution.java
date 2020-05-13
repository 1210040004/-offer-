package 面试.算法.leetcode.Q63不同路径;

public class Solution {
    // 有障碍的情况下的路径问题
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m=obstacleGrid.length;
        int n=obstacleGrid[0].length;
        int[][] dp = new int[m][n];
        if(obstacleGrid[0][0]==1 || obstacleGrid[m-1][n-1]==1){
            return 0;
        }
        dp[0][0]=1;
        for (int i = 1; i < m; i++) {
            if (obstacleGrid[0][i] == 1) dp[0][i] = 0;
            else dp[0][i] = dp[0][i-1];
        }
        for (int i = 0; i < n; i++) {

            if (obstacleGrid[i][0] == 1) dp[i][0] = 0;
            else dp[i][0] = dp[i-1][0];
        }



        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if(obstacleGrid[i][j] == 0){
                    dp[i][j]=dp[i-1][j]+dp[i][j-1];
                }else {
                    dp[i][j]=0;
                }
            }
        }
        return dp[m-1][n-1];
    }
    private  static void printmap(int[][] map){
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[0].length; j++) {
                System.out.print(map[i][j]+" ");
            }
            System.out.println();
        }
    }
}
