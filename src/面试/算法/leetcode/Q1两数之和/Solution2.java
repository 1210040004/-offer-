package 面试.算法.leetcode.Q1两数之和;

import java.util.HashMap;

public class Solution2 {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i],i);
        }
        for (int i = 0; i < nums.length; i++) {
            int val = target - nums[i];
            if (map.containsKey(val) && map.get(val)!= i){
                 return new int[]{i,map.get(val)};
            }
        }
        return null;
    }
}
