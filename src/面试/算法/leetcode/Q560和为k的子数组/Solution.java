package 面试.算法.leetcode.Q560和为k的子数组;

public class Solution {
    public int subarraySum(int[] nums, int k) {
        //
        int res = 0;
        for (int i = 0; i < nums.length; i++) {
            int sum =0 ;
            for (int j = i; j >=0 ; j--) {
                sum+=nums[j];
                if (sum == k){
                    res++;
                }
            }
        }
        return res;
    }
}
