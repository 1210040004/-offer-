package 面试.算法.leetcode.验证一个字符串是否是回文串;

import java.util.Stack;

public class Solution {
    public static boolean isPalindrome(String s) {
        int n = s.length();
        if(n==0){
            return true;
        }
        int i = 0 ;
        int j = n-1;
         s = s.toLowerCase();
        while (i<j){
            while(i<j&&!Character.isLetterOrDigit(s.charAt(i))){
                i++;
            }
            while(i<j&&!Character.isLetterOrDigit(s.charAt(j))){
                j--;
            }
            if (s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        isPalindrome("race a car");
    }
}
