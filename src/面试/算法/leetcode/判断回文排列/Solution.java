package 面试.算法.LeetCode.判断回文排列;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static boolean canPermutePalindrome(String s) {
        Map<Character,Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))){
                map.put(s.charAt(i),map.get(s.charAt(i))+1);
            }else {
                map.put(s.charAt(i),1);
            }
        }
        Collection<Integer> values = map.values();
        int oddCount = 0;
        for (Integer value : values) {
            if (value%2==1){
                oddCount++;
            }
        }
        return oddCount<=1;
    }

    public static void main(String[] args) {
        System.out.println(canPermutePalindrome("taci"));
    }
}
