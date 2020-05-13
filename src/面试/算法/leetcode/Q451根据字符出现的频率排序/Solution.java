package 面试.算法.leetcode.Q451根据字符出现的频率排序;

import java.util.*;

public class Solution {
    public String frequencySort(String s) {
        TreeMap<Character,Integer> map = new TreeMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (map.containsKey(c)){
                map.put(c,map.get(c)+1);
            }else {
                map.put(c,1);
            }
        }
        StringBuilder sb = new StringBuilder();
        ArrayList<Integer> values = (ArrayList<Integer>) map.values();
        Set<Map.Entry<Character, Integer>> entries = map.entrySet();
        Collections.sort(values);
        return "";
    }
    public static String frequencySort2(String s) {
        Map<Character, Integer> frequencyForNum = new HashMap<>();
        for (char c : s.toCharArray())
            frequencyForNum.put(c, frequencyForNum.getOrDefault(c, 0) + 1);

        List<Character>[] frequencyBucket = new ArrayList[s.length() + 1];
        for (char c : frequencyForNum.keySet()) {
            int f = frequencyForNum.get(c);
            if (frequencyBucket[f] == null) {
                frequencyBucket[f] = new ArrayList<>();
            }
            frequencyBucket[f].add(c);
        }
        StringBuilder str = new StringBuilder();
        for (int i = frequencyBucket.length - 1; i >= 0; i--) {
            if (frequencyBucket[i] == null) {
                continue;
            }
            for (char c : frequencyBucket[i]) {
                for (int j = 0; j < i; j++) {
                    str.append(c);
                }
            }
        }
        return str.toString();
    }

        public String frequencySort3(String s) {
            char[] chs = s.toCharArray();
            Map<Character, Integer> map = new HashMap<>();
            int maxTimes = -1;
            //统计每个字母的频次，并存入哈希表
            for(char c : chs){
                if(!map.containsKey(c)){
                    map.put(c, 1);
                }else{
                    map.put(c, map.get(c) + 1);
                }
                maxTimes = map.get(c) > maxTimes ? map.get(c) : maxTimes;
            }
            //新建一个桶，将字母存入索引为它的频次的桶里
            ArrayList<Character>[] buckets = new ArrayList[maxTimes + 1];
            for(char c : map.keySet()){
                int frequency = map.get(c);
                if(buckets[frequency] == null){
                    buckets[frequency] = new ArrayList<>();
                }
                buckets[frequency].add(c);
            }
            //倒着遍历桶，将桶里的字母取出来，并按照它的频次插入字符数组中
            int p = 0;
            for(int i = maxTimes; i >= 0; i--){
                if(buckets[i] != null){
                    for(char c : buckets[i]){
                        //buckets[i]这个桶里的字母的频次为i，因此要插入i个到结果集中
                        for(int j = 0; j < i; j++){
                            //复用chs作为结果集
                            chs[p++] = c;
                        }
                    }
                }
            }
            return new String(chs);
        }
    public static String frequencySort4(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        int length = s.length();
        int max = 0;
        for (int i = 0; i < length; i++) {
            if (map.containsKey(s.charAt(i))){
                map.put(s.charAt(i),map.get(s.charAt(i))+1);
            }else {
                map.put(s.charAt(i),1);
            }
            max = Math.max(max, map.get(s.charAt(i)));
        }
        ArrayList<Character>[] buckets = new ArrayList[max+1];
        for (Character c : map.keySet()) {
            int frenquency = map.get(c);
            if (buckets[frenquency] == null){
                buckets[frenquency] =  new ArrayList<>();
            }
            buckets[frenquency].add(c);
        }
        StringBuilder sb = new StringBuilder();
        for (int i = max; i >=0 ; i--) {
            //i 是出现次数
           if (buckets[i]!=null){
               for (Character character : buckets[i]) {
                   for (int j = 0; j < i; j++) {
                       sb.append(character);
                   }
               }
           }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        frequencySort4("tree");
    }
}
