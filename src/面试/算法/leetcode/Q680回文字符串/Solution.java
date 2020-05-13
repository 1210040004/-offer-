package 面试.算法.leetcode.Q680回文字符串;

public class Solution {
    public static boolean validPalindrome(String s) {
        int r = s.length()-1;
        int l = 0 ;
        int count =0;
        while(l<r){
            if(count<2) {
                if (s.charAt(l) == s.charAt(r)) {
                    l++;
                    r--;
                }else {
                    r--;
                    count++;
                    if (count>=2){
                        return false;
                    }
                }
            }else {
                return false;
            }
        }
        return true;
    }
    public static boolean validPalindrome2(String s){
            for (int i = 0, j = s.length() - 1; i < j; i++, j--) {
                if (s.charAt(i) != s.charAt(j)) {
                    return isPalindrome(s, i, j - 1) || isPalindrome(s, i + 1, j);
                }
            }
            return true;
        }

        private static boolean isPalindrome(String s, int i, int j) {
            while (i < j) {
                if (s.charAt(i++) != s.charAt(j--)) {
                    return false;
                }
            }
            return true;
        }

    public static void main(String[] args) {
        boolean abca = validPalindrome("abfca");
        System.out.println(abca);
    }
}
