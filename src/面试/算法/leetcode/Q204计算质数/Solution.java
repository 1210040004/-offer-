package 面试.算法.leetcode.Q204计算质数;

public class Solution {
    public int countPrimes(int n) {
        boolean[] f = new boolean[n+1];
        int count = 0;
        for (int i = 2; i < n; i++) {
            if (f[i]){
                continue;
            }
            for (long j = (long) (i)* i; j <n ; j+=i) {
                f[(int)j]= true;
            }
        }
        return count;
    }
}
