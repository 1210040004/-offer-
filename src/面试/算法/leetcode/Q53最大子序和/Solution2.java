package 面试.算法.leetcode.Q53最大子序和;

public class Solution2 {
    public int maxSubArray(int[] nums) {
         if(nums==null || nums.length==0){
             return  0;
         }
         if (nums.length==1){
             return nums[0];
         }
         int result =nums[0];
        for (int i = 1; i < nums.length; i++) {
            nums[i]= Math.max(nums[i-1]+nums[i],nums[i]);
            result = Math.max(result,nums[i]);
        }
        return  result;
    }
}
