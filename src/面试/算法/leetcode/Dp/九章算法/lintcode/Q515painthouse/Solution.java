package 面试.算法.leetcode.Dp.九章算法.lintcode.Q515painthouse;

public class Solution {
    public int minCost(int[][] costs) {
        // write your code here
        int n=costs.length;
        if(n==0){
            return 0;
        }
        int[][] f= new int[n+1][3];
        int i,j,k,res;
        f[0][0]=f[0][1]=f[0][2]=0;
        for ( i = 1; i <=n ; i++) {
            //j is the color of i-1
            for ( j = 0; j <3 ; j++) {
                f[i][j]=Integer.MAX_VALUE;
                for (k = 0; k < 3; k++) {
                    if(j==k){
                        continue;
                    }
                    if(f[i-1][k]+costs[i-1][j]<f[i][j]){
                       f[i][j]= f[i-1][k]+costs[i-1][j];
                    }
                }
            }
        }
        res=f[n][0];
        if(f[n][1]<res){
            res =f[n][1];
        }
        if(f[n][2]<res){
            res = f[n][2];
        }
        return res;
    }
}
