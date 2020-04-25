package 面试.算法.LeetCode.判断字符串是否为重排;

import java.util.Arrays;

public class Solution {
    public boolean CheckPermutation(String s1, String s2) {
        if (s1==null && s2==null){
            return true;
        }
        if (s1 == null || s2 == null || s1.length()!=s2.length()){
            return false;
        }

        char[] cs1 = s1.toCharArray();
        char[] cs2 = s2.toCharArray();
        Arrays.sort(cs1);
        Arrays.sort(cs2);
        for (int i = 0; i < cs1.length; i++) {
            if (cs1[i]!=cs2[i]){
                return false;
            }
        }
        return true;
    }
}
