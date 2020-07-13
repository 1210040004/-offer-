package 面试.算法.leetcode.Q5最长回文串;

public class Solution4 {
    // 一个数组的最长回文子串
    int start = 0;
    int len = 0;
    public String longestPalindrome(String s) {
        int length = s.length();
        if (s.length()<2){
            return s.substring(0);
        }
        for (int i = 0; i < s.length()-1; i++) {
            findLongestPath(s,i,i);
            findLongestPath(s,i,i+1);
        }
        return s.substring(start,start+len);
    }

    private void findLongestPath(String s, int i, int j) {
        while(i>=0 && j<s.length() && s.charAt(i)==s.charAt(j)){
            j++;
            i--;
        }
        if ((j-i-1)>len){
            len = j-i-1;
            start= i+1;
        }
    }
}
