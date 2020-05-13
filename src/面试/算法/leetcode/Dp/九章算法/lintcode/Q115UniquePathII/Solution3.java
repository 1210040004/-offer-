package 面试.算法.leetcode.Dp.九章算法.lintcode.Q115UniquePathII;

public class Solution3 {
    public int uniquePathsWithObstacles(int[][] a) {
        // write your code here
        // 先初始话
        int m = a.length;
        int n = a[0].length;
        if(a[0][0]==1 || a[m-1][n-1] ==1){
            return 0;
        }
        int[][] f= new int[m][n];
        // 初始首行首列
        f[0][0]=1;
        for (int i = 1; i < m; i++) {
            if(a[i][0]==1){
                f[i][0]=0;
            }else {
                f[i][0]=f[i-1][0];
            }
        }
        for (int i = 1; i < n; i++) {
            if(a[0][i]==1){
                f[0][i]=0;
            }else {
                f[0][i]=f[0][i-1];
            }
        }
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if(a[i][j]==1){
                    f[i][j]=0;
                }else {
                    f[i][j]=f[i-1][j]+f[i][j-1];
                }
            }
        }
        return f[m-1][n-1];
    }
}
