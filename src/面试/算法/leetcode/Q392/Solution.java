package 面试.算法.leetcode.Q392;

public class Solution {
    public  static boolean isSubsequence(String s, String t) {
        // 判断t 是否包含s
        int m = s.length();
        int n = t.length();
        if (m==0){
            return true;
        }
        int j = 0;
        for (int i = 0; i < n; i++) {
            if (t.charAt(i) == s.charAt(j)){
                j++;
                if (j==m){
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isSubsequence("axc", "ahbgdc"));
    }
}
