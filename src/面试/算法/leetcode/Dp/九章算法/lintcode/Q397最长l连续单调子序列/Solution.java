package 面试.算法.leetcode.Dp.九章算法.lintcode.Q397最长l连续单调子序列;

public class Solution {
    int result =0 ;
    public int longestIncreasingContinuousSubsequence(int[] A) {
        // write your code here
        int n = A.length;
        if(n==0) {
            return 0;
        }
        calcu(A, n);
        //对A进行反转
        int i,j,t;
        i=0;
        j=n-1;
        while(i<j){
            t=A[i];
            A[i]=A[j];
            A[j]=t;
            ++i;
            --j;
        }
        calcu(A,n);
        return result;
    }

    private void calcu(int[] A, int n) {
        int[] f= new int[n];
        for (int i = 0; i < n; i++) {
            // option 1
            f[i]=1;
            // option2
            if(i>0 && A[i-1]<A[i]){
                f[i]=f[i-1]+1;
            }
            if(f[i]>result){
                result =f[i];
            }
        }
    }
}
