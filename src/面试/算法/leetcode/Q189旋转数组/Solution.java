package 面试.算法.leetcode.Q189旋转数组;

import java.util.Arrays;

public class Solution {
    public  static void rotate(int[] nums, int k) {
        int[] arr = new int[nums.length*2];
        int temp = 0 ;
        for (int i = 0; i < 2; i++) {
            for (int num : nums) {
                arr[temp++] = num;
            }
        }
        nums = Arrays.copyOfRange(arr, nums.length - 3, 2 * nums.length - 3);
    }

    public static void main(String[] args) {
        int[] arr= {1,2,3,4,5,6,7};
        rotate(arr,3);
    }
}
