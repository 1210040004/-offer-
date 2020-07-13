package 面试.算法.leetcode.Q53最大子序和;

public class Solution4 {
    public int maxSubArray(int[] nums) {
        // 最大子序和
        if ( nums==null ){
            return 0;
        }
        int[] f = new int[nums.length];
        f[0] = nums[0];
        int max = f[0];
        for (int i = 1; i < nums.length; i++) {
            f[i] = Math.max(f[i-1]+nums[i], nums[i]);
            max = Math.max(max,f[i]);
        }
        return max;
    }
}
