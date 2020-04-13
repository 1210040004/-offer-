package 面试.算法.leetcode.Q5最长回文串;

public class Solution {
private static int index, len;
public static String longestPalindrome(String s) {
        int n = s.length();
        if (n<2){
        return s;
        }
        for (int i = 0; i < s.length()-1; i++) {
        Helper(s,i,i);
        Helper(s,i,i+1);
        }
        return s.substring(index,index+len);
        }

private static void Helper(String s, int l, int r) {
        while(l>=0 && r<s.length() && s.charAt(l) == s.charAt(r)){
        l--;
        r++;
        }
        if(len<r-l-1){
        index = l+1;
        len = r-l-1;
        }
        }
    public static void main(String[] args) {
        longestPalindrome("babad");
    }
}


