package 面试.算法.leetcode.Q1两数之和;

import java.util.HashMap;

public class Solution3 {
    public static int[]  twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int index = 0;
        for (int num : nums) {
            map.put(num,index++);
        }
        for (int i = 0; i < nums.length; i++) {
            int reduce = target-nums[i];
            if (map.containsKey(reduce) && map.get(reduce)!= i){
                return new int[]{i,map.get(reduce)};
            }
        }
        return null;
    }

    public static void main(String[] args) {
        int[] arr= {3,2,4};
        int[] ints = twoSum(arr, 6);
        for (int anInt : ints) {
            System.out.println(anInt);
        }
    }
}
