package 面试.算法.leetcode.Q5最长回文串;

public class Solution {
    int index=0,len=0;
    public String longestPalindrome(String s) {
        if (s.length()<2){
            return s;
        }
        for (int i = 0; i < s.length(); i++) {
            Helper(s,i,i);
            Helper(s,i,i+1);
        }
        return s.substring(index,index+len);
    }

    private void Helper(String s, int i, int j) {
         while(i>=0 && j<=s.length()-1 && s.charAt(i)==s.charAt(j)){
             i--;
             j++;
         }
         if (j-i-1>len){
             len = j-i-1;
             index = i+1;
         }
    }
}
