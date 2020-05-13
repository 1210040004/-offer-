package 面试.算法.leetcode.Q345反转元音字母;

public class Solution {
    public static String reverseVowels(String s) {
        int l = 0;
        int r = s.length()-1;
        char[] c = s.toCharArray();
        while(l<r){
            while(l<r && !isaeiou(c[l])){
                l++;
            }
            while(l<r && !isaeiou(c[r])){
                r--;
            }
            swap(c,l,r);
            l++;
            r--;
        }
        return new String(c);
    }

    private static void swap(char[] c, int l, int r) {
        char tmp = c[l];
        c[l] = c[r];
        c[r] = tmp;
    }

    private  static boolean isaeiou(char c) {
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        reverseVowels("hello");
    }

}
