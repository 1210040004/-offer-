package 面试.算法.leetcode.Q最长回文串;

import java.util.Collection;
import java.util.HashMap;

public class Solution {
    public static int longestPalindrome(String s){
        char[] c = s.toCharArray();
        HashMap<Character,Integer> map = new HashMap<>();
        for (int i = 0; i < c.length; i++) {
            if (map.containsKey(c[i])){
                map.put(c[i],map.get(c[i])+1);
            }else {
                map.put(c[i],1);
            }
        }
        Collection<Integer> values = map.values();
        int result = 0;
        for (Integer value : values) {
            if (value%2==1){
                result++;
            }
        }
       if (result==0){
           return c.length;
       }else {
           return c.length-result+1;
       }
    }

    public static void main(String[] args) {
        String s ="abccccdd";

        System.out.println(longestPalindrome(s));
    }
}
