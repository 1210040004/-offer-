package 面试.算法.leetcode.Q80删除数组中的重复项II;

/**
 * @author wcx
 */
public class Solution {
    public static int removeDuplicates(int[] nums) {
        int idx = 0;

        for (int i = 1; i < nums.length; i++) {
            while(nums[i]==nums[i-1]){
                i++;
            }
            nums[idx++] = nums[i];
        }
        return idx+1;
    }

    public static void main(String[] args) {
        int[] arr = {1,1,1,2,2,3};
        System.out.println(removeDuplicates(arr));
    }
}
