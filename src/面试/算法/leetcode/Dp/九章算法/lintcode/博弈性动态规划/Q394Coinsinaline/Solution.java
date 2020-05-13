package 面试.算法.leetcode.Dp.九章算法.lintcode.博弈性动态规划.Q394Coinsinaline;

public class Solution {
    public boolean firstWillWin(int n) {
        // write your code here
        if (n==0){
            return  false;
        }
        if (n<=2){
            return true;
        }
        boolean[] f= new boolean[n+1];
        f[1]=true;
        f[2]=true;
        for (int i = 3; i <=n; i++) {
            f[i]=(f[i-1]==false||f[i-2]==false)? true:false;
        }
        return f[n];
    }
}
