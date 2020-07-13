package 面试.算法.leetcode.Q14最长公共前缀;

import netscape.security.UserTarget;

import java.util.Arrays;

public class Solution {
    public  String longestCommonPrefix(String[] strs) {
        if (strs== null || strs.length<1){
            return "";
        }
        Arrays.sort(strs);
        StringBuilder sb =new StringBuilder();
        String s = strs[0];
        for (int i = 1; i < strs.length; i++) {
            if (s.charAt(i)== strs[strs.length-1].charAt(i)){
                sb.append(strs[0].charAt(i));
            }else {
                break;
            }
        }
        return sb.toString();
    }
}
