package 面试.算法.leetcode.Q3无重复字符的最长字串;

import java.util.LinkedList;

public class Solution4 {
    public int lengthOfLongestSubstring(String s) {
        if (s== null ||s.length() ==0 ){
            return 0;
        }
        char[] c = s.toCharArray();
        int length = 1 ;
        int i = 0, j = 0;
        LinkedList<Character> list = new LinkedList<>();
        while(i<s.length() && j<s.length()){
            while(i<s.length() && j<s.length() && !list.contains(c[j])){
                list.add(c[j++]);
                length = Math.max(length,j-i);
            }
            while (i<s.length() && j<s.length() && list.contains(c[j])){
                list.removeFirst();
                i++;
            }
        }
        return length;
    }
}
