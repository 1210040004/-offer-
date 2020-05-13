package 面试.算法.leetcode.Q125验证回文串;

public class Solution {
        public  static boolean isPalindrome(String s) {
            if(s== null || s.length()==0){
                return true;
            }
            int i = 0 ;
            int j = s.length()-1;
            while(i<j){
                while(!((s.charAt(i)>='0'&& s.charAt(i)<='9')||(s.charAt(i)>='a'&&s.charAt(i)<='z')|| (s.charAt(i)>='A' &&s.charAt(i)<='Z'))){
                    i++;
                }
                while(!((s.charAt(j)>='0'&& s.charAt(j)<='9')||(s.charAt(j)>='a'&&s.charAt(j)<='z')|| (s.charAt(j)>='A' &&s.charAt(j)<='Z'))){
                    j--;
                }
                if(Character.toLowerCase(s.charAt(i))!=Character.toLowerCase(s.charAt(j))){
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
