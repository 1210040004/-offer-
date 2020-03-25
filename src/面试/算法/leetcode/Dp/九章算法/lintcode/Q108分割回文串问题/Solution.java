package 面试.算法.leetcode.Dp.九章算法.lintcode.Q108分割回文串问题;

import sun.rmi.server.InactiveGroupException;

public class Solution {
    public int minCut(String s) {
        // write your code here
        int n = s.length();
        if(n<=1){
            return 0;
        }
        int[] f= new int[n];
        f[0]=0;
        for (int i = 1; i < n; i++) {
            int min= Integer.MAX_VALUE;
            for (int j = 1; j < i; j++) {
                if(isreback(s.substring(j,i-1))){
                    f[i]=Math.max(f[i],f[j]+1);
                }
            }
        }
        return 0;
    }

    public static boolean isreback(String s){
        int n = s.length();
        int i=0;
        int j=n-1;
        boolean flag= true;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
        }
        return flag;
    }
}
