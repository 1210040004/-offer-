package 面试.算法.leetcode.Q3无重复字符的最长字串;

import java.util.HashSet;
import java.util.Set;

public class Solution3 {
    public  static int lengthOfLongestSubstring(String s) {
        int len = s.length();
        if (s.length()<=1){
            return s.length();
        }

        int maxlen = 1;
        for (int i = 0; i < len; i++) {
            HashSet<Character> set= new HashSet<>();
            for (int j = i; j >=0 ; j--) {
                if (set.contains(s.charAt(j))){
                    maxlen = Math.max(maxlen,set.size());
                    break;
                }else {
                    set.add(s.charAt(j));
                }
            }
        }
        return maxlen;
    }
    public int lengthOfLongestSubstring2(String s) {
            int n = s.length();
            Set<Character> set = new HashSet<>();
            int ans = 0, i = 0, j = 0;
            while (i < n && j < n) {
                // try to extend the range [i, j]
                if (!set.contains(s.charAt(j))){
                    set.add(s.charAt(j++));
                    ans = Math.max(ans, j - i);
                }
                else {
                    set.remove(s.charAt(i++));
                }
            }
            return ans;
        }
    public static int lengthOfLongestSubstring3(String s) {
        // 应用滑动窗口的方法来解决问题
        if (s==null || s.length()<=1){
            return s.length();
        }
        int n = s.length();
        int i = 0 ,j = 0,maxlen=1;
        HashSet<Character> set = new HashSet<>();
        while(i<n && j<n){
            while(i<n && j<n &&!set.contains(s.charAt(j))){
                set.add(s.charAt(j));
                j++;
                maxlen =Math.max(maxlen,j-i);
            }
            while(i<n && j<n && set.contains(s.charAt(j))){
                set.remove(s.charAt(i++));
            }
        }
        return maxlen;
    }

    public static void main(String[] args) {
        lengthOfLongestSubstring3("abcabcbb");
    }
}
