package 面试.算法.leetcode.Q5最长回文串;

public class Solution3 {
    static int index = 0;
    static int len = 0;
    public static String longestPalindrome(String s) {
        int len = s.length();
        if (len<=1){
            return s;
        }
        for (int i = 0; i < len; i++) {
            findpath(s,i,i);
            findpath(s,i,i+1);
        }
        return s.substring(index , index +len);
    }

    private  static void findpath(String s, int i, int j) {
        while(i>=0 && j<=s.length()-1 && s.charAt(i) == s.charAt(j)){
            i--;
            j++;
        }
        int l = j - i -1;
        if (l>len){
            len = l;
            index = i+1;
        }
    }

    public static void main(String[] args) {
        String babad = longestPalindrome("babad");
        System.out.println(babad);
    }
}
