package 面试.算法.leetcode.Q347前k个高频元素;

import java.util.*;

public class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] res= new int[k];
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i : nums) {
            if (!map.containsKey(i)){
                map.put(i,1);
            }else {
                map.put(i,map.get(i)+1);
            }
        }
        Collection<Integer> values = map.values();
        ArrayList<Integer> list = new ArrayList<>();
        for (Integer value : values) {
            list.add(value);
        }
        Collections.sort(list);
        int temp =0;
        while(temp<k){
            Integer i = list.get(temp);

        }
        return nums;
    }
}
