package 面试.算法.leetcode.Q279完全平方数;

public class Solution {
    public  static int numSquares(int n) {
        if (n<=0){
            return 0;
        }
        int[] f = new int[n+1];
        f[1] = 1;
        for (int i = 2; i <= n; i++) {
            f[i] = i ;//最坏的情况，每次+1;
            for (int j = 1; i-j*j >=0; j++) {
                f[i] = Math.min(f[i],f[i-j*j]+1);
            }
        }
        return f[n];
    }

    public static void main(String[] args) {
        System.out.println(numSquares(3));
    }
}
