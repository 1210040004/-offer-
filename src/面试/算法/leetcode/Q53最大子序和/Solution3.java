package 面试.算法.leetcode.Q53最大子序和;

public class Solution3 {
    public  static int maxSubArray(int[] nums) {
        int n = nums.length;
        int[] f = new int[n];
        f[0] = nums[0];
        int max = nums[0] ;
        for (int i = 1; i < n; i++) {
            f[i] = Math.max(f[i-1]+nums[i],nums[i]);
            max = Math.max(f[i],max);
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr= {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(arr));
    }
}
