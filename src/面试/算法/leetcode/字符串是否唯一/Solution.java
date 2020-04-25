package 面试.算法.LeetCode.字符串是否唯一;

import java.util.HashSet;

public class Solution {
    public boolean isUnique(String astr) {
        HashSet<Character> set= new HashSet<>();
        for (int i = 0; i < astr.length(); i++) {
            if (set.contains(astr.charAt(i))){
                return false;
            }else {
                set.add(astr.charAt(i));
            }
        }
        return true;
    }
}
