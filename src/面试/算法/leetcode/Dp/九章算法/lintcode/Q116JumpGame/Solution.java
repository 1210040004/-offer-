package 面试.算法.leetcode.Dp.九章算法.lintcode.Q116JumpGame;

public class Solution {
    public boolean canJump(int[] A) {
        // write your code here
        int n =A.length;
        boolean[] f= new boolean[n];
        f[0]=true;
        for (int i = 1; i <n; i++) {
            f[i]=false;
            for (int j = i-1; j >=0  ; j--) {
                if(f[j]&&j+A[j]>=i){
                    f[i]=true;
                }
            }
        }
        return f[n-1];
    }
}
