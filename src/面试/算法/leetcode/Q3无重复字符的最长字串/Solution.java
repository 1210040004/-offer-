package 面试.算法.leetcode.Q3无重复字符的最长字串;

public class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        if(s==null || n<=1){
            throw  new RuntimeException("输入的字串无效");
        }
        int[] f=new int[n];
        f[0] =1;
        char[] c = s.toCharArray();
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {

            }
        }
        return 0;
    }
}
