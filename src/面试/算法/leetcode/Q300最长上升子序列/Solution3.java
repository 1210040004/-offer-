package 面试.算法.leetcode.Q300最长上升子序列;

import java.util.Arrays;

public class Solution3 {
    public int lengthOfLIS(int[] nums) {
        if (nums== null|| nums.length==0){
            return 0;
        }
        int[] f = new int[nums.length];
        int res = 0;
        Arrays.fill(f,1);
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i]>nums[j]){
                    f[i] =Math.max(f[i],f[j]+1);
                }
            }
            res = Math.max(res,f[i]);
        }
        return res;
    }
}
