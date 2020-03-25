package 面试.算法.leetcode.Dp.九章算法.lintcode.Q397最长l连续单调子序列;

public class Solution2 {
    int len;
    public int longestIncreasingContinuousSubsequence(int[] A) {
        // write your code here
        int n = A.length;
        int[] f= new int[n];
        calc(A);
        // 反转A
        int i=0;
        int j=n-1;
        int t;
        while(i<j){
            t=A[j];
            A[j]=A[i];
            A[i]=t;
            i++;
            j--;
        }
        calc(A);
        return len;

    }

    private void calc(int[] a) {
        int n = a.length;
        int[] f= new int[n];
        for (int i = 0; i < n; i++) {
            f[i]=1;
            if(i>0 &&  a[i]>a[i-1]){
                f[i]=f[i-1]+1;
            }
            if(f[i]>len){
                len=f[i];
            }
        }
    }
}
