    package 面试.算法.leetcode.Dp.九章算法.lintcode.Q76最长上升子序列的长度;

    public class Solution {
        public int longestIncreasingSubsequence(int[] nums) {
            // write your code here
            int n = nums.length;
            int[] f= new int[n];

            f[0]=1;
            int max=-1;
            for (int i = 1; i <n ; i++) {
                for (int j = 0; j < i; j++) {
                    f[i]=1;
                    if(nums[i]>nums[j] && f[j]+1>f[i]){
                        f[i]=f[j]+1;
                    }
                }
                if (max<f[i]){
                    max=f[i];
                }
            }
            return max;
        }
    }
