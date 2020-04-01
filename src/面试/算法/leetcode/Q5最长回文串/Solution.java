package 面试.算法.leetcode.Q5最长回文串;

public class Solution {
    public String longestPalindrome(String s) {
            // 最长回文串
            if(s==null || s.length()<2){
                return null;
            }
            int n =s.length();
            int start=0;
            int end =0;
            int len =1 ;
            boolean[][] f= new boolean[n][n];
            for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if(s.charAt(j) ==s.charAt(i)  && (i-1<=2 ||f[j+1][i-1])){
                    f[j][i] = true;
                }
            }
        }
        return null;
    }
}
