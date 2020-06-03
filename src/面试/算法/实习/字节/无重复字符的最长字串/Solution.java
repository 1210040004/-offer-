package 面试.算法.实习.字节.无重复字符的最长字串;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Solution {
    public int lengthOfLongestSubstring(String s) {
        char[] c = s.toCharArray();
        LinkedList<Character> queue = new LinkedList<>();
        int res = 0 ;
        int i = 0,j=0;
        while(i<c.length && j<c.length){
            while(i<c.length && j<c.length && !queue.contains(c[j])){
                queue.add(c[j++]);
                res = Math.max(res,j-i);
            }
            while (i<c.length && j<c.length &&queue.contains(c[j])){
                queue.removeFirst();
                i++;
            }
        }
        return res;
    }
}
