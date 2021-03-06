package 面试.算法.实习.字节.打家劫舍;

import java.util.Arrays;

public class Solution2 {
    public int rob(int[] nums) {
        if (nums==null && nums.length==0){
               return 0;
        }
        if (nums.length ==1){
            return nums[0];
        }
        if (nums.length==2){
            return Math.max(nums[0],nums[1]);
        }
        int[] pre = Arrays.copyOfRange(nums, 0, nums.length - 1);
        int[] later = Arrays.copyOfRange(nums, 1, nums.length);
        return Math.max(getRob(pre),getRob(later));
    }
    public int getRob(int[] nums) {
        if (nums== null || nums.length == 0){
            return 0;
        }
        int[] f = new int[nums.length];
        if (nums.length == 1) {
            return nums[0];
        }
        if (nums.length==2){
            return Math.max(nums[0],nums[1]);
        }
        f[0] = nums[0];
        f[1] = Math.max(nums[0],nums[1]);
        for (int i = 2; i <nums.length; i++) {
            f[i] = Math.max(f[i-1],f[i-2]+nums[i]);
        }
        return f[nums.length-1];
    }
    public int getrob(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        if(nums.length==1){
            return nums[0];
        }
        if(nums.length==2){
            return Math.max(nums[0],nums[1]);
        }
        int n =nums.length;
        int[] f= new int[n+1];
        f[0]=nums[0];
        f[1]=Math.max(nums[0],nums[1]);
        for (int i = 2; i < nums.length; i++) {
            f[i]=Math.max(f[i-2]+nums[i],f[i-1]);
        }
        return f[n-1];
    }

}
