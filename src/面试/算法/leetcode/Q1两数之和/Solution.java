package 面试.算法.leetcode.Q1两数之和;

import java.util.HashMap;

public class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;

        int[] res =new int[2];
        for (int i=0;i < n-1; i++) {
            for (int j = i+1; j < n ; j++) {
                if (nums[i]+nums[j]==target){
                    res[0]=i;
                    res[1]=j;
                    break;
                }
            }
        }
        return res;
    }
    public static int[] twoSum2(int[] nums, int target) {
        int[] res= new int[2];
        HashMap<Integer,Integer> map  = new HashMap<>();
        if(nums.length==0 || nums==null){
            return res;
        }
        for (int i = 0; i < nums.length; i++) {
            if(map.containsKey(target-nums[i])){
                res[0]=i;
                res[1]=map.get(target-nums[i]);
                return res;
            }
            map.put(nums[i],i);
        }
        return  res;
    }

    public static void main(String[] args) {
        int[] arr=new int[]{2, 7, 11, 15};
        twoSum2(arr,9);
    }
}
