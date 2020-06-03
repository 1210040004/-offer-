package 面试.算法.实习.字节.一个数组的最大子数组的和;

public class Solution {
    public static int maxSubArray(int[] nums) {
        if (nums==null || nums.length==0){
            return 0;
        }

        int len = nums.length;
        int[] f = new int[len];
        f[0] =nums[0];
        int max= nums[0];
        for (int i = 1; i < len; i++) {
            f[i] = Math.max(f[i-1]+nums[i],nums[i]);
            max = Math.max(f[i],max);
        }
        return max;
    }

    public static void main(String[] args) {
     int[] arr= {1};
     maxSubArray(arr);
    }
}
