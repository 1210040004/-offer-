package 面试.算法.leetcode.Q53最大子序和;

public class Solution {
    public static int maxSubArray(int[] nums) {
        int len = nums.length;
        if(len==0){
            return 0;
        }
        int[] res= new int[len+1];
        res[0]=Integer.MIN_VALUE;
        for (int i = 1; i <len ; i++) {
            res[i]=Math.max(res[i-1]+nums[i],res[i-1]);
        }
        return res[len];
    }
}
