package 面试.算法.leetcode.Q49字母的同分异位词;

import java.util.*;

public class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs.length == 0) {
            return new ArrayList<>();
        }
        Map<String, List> map = new HashMap<>();
        for (String s : strs) {
            char[] c = s.toCharArray();
            Arrays.sort(c);
            String t = String.valueOf(c);
            if (!map.containsKey(t)) {
                // 创建一个新的String key 相当于一个牌子
                map.put(t, new ArrayList());
            }
            map.get(t).add(s);
        }
        return null;
    }

    public List<List<String>> groupAnagrams2(String[] strs) {
        if (strs.length ==0 ){
             return new ArrayList<>();
        }
        HashMap<String,List<String>> map = new HashMap<>();

        for (String s : strs) {
            char[] c = s.toCharArray();
            Arrays.sort(c);
            String t = String.valueOf(c);
            if (!map.containsKey(t)){
                map.put(t,new ArrayList());
            }
            map.get(t).add(s);
        }
        return new ArrayList<>(map.values());
    }
}
