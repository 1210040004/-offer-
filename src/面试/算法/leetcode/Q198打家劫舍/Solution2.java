package 面试.算法.leetcode.Q198打家劫舍;

public class Solution2 {
    public static int rob(int[] nums) {
        if (nums==null || nums.length == 0){
            return  0;
        }
        // f 代表一个节点的个数
        int[] f= new int[nums.length];
        if (nums.length==1){
            return nums[0];
        }
        if (nums.length==2){
            return Math.max(nums[0],nums[1]);
        }
        f[0] = nums[0];
        f[1] = Math.max(nums[0],nums[1]);
        for (int i = 2; i <nums.length ; i++) {
            if (f[i-2]+nums[i]>f[i-1]){
                f[i] = f[i-2]+nums[i];
            }else {
                f[i] = f[i-1];
            }
        }
        return f[nums.length-1];
    }

    public static void main(String[] args) {
        int[] arr = {4,9,7,1};
        rob(arr);
    }
}
