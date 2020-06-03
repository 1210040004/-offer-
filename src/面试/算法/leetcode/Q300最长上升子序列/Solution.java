package 面试.算法.leetcode.Q300最长上升子序列;

import java.util.Arrays;

public class Solution {
    public static int lengthOfLIS(int[] nums) {
        if ( nums==null || nums.length == 0){
            return 0;
        }
        int[] f = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int max= 1;
            for (int j = 0; j < i; j++) {
                if (nums[i]>nums[j]){
                    max =Math.max(max,f[j]+1);
                }
            }
            f[i] = max;
        }
        int ret = 0;
        for (int i = 0; i < f.length; i++) {
            ret = Math.max(ret, f[i]);
        }
        return ret;
    }

    public static void main(String[] args) {
        int[] arr= {10,9,2,5,3,4};
        int i = lengthOfLIS(arr);
        System.out.println(i);
    }
}
