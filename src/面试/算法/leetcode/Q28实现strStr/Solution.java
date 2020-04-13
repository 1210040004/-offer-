package 面试.算法.leetcode.Q28实现strStr;

public class Solution {
    public static int strStr(String haystack, String needle) {
        int n = haystack.length();
        int m = needle.length();
        if (m==0 ){
            return 0;
        }
        if(m>n) {
            return -1;
        }
        for (int i = 0; i < n-m+1; i++) {
            if (haystack.charAt(i)==needle.charAt(0)){
                if (haystack.substring(i,i+m).equals(needle)){
                    return i;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(strStr("aaa", "bba"));
    }
}
