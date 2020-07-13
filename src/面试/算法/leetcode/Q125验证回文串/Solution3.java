package 面试.算法.leetcode.Q125验证回文串;

public class Solution3 {
    public static boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        s=s.toLowerCase();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isLetterOrDigit(c)){
                sb.append(c);
            }
        }
        int i = 0;
        int j = sb.length()-1;
        while (i<j){
            if (sb.charAt(i)!=sb.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        isPalindrome("A man, a plan, a canal: Panama");
    }
}
