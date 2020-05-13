package 面试.算法.leetcode.Dp.九章算法.lintcode.背包型动态规划.Q564背包6;

public class Solution {
    public static int backPackVI(int[] nums, int target) {
        // write your code here
        if (target<=0){
            return 0;
        }
        int[] f= new int[target+1];
        f[0]=1;
        for (int i = 1; i <= target; i++) {
            f[i]=0;
            for (int j = 0; j < nums.length; j++) {
                if (i>=nums[j]){
                    f[i]+=f[i-nums[j]];
                }
            }
        }
        return f[target];
    }

    public static void main(String[] args) {
        int[] arr= {1,2,4};
        int target=4;
        backPackVI(arr,target);
    }
}
