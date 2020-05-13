package 面试.算法.leetcode.Q31下一个排列;

import java.util.Arrays;

public class Solution {
    public static void nextPermutation(int[] nums) {
        int i = nums.length - 2;
        while(i>=0 && nums[i+1]<=nums[i]){
            i--;
        }
        if (i>=0){
            int j = nums.length-1;
            while(j>=0 && nums[j]<=nums[i]){
                j--;
            }
            swap(nums,i,j);
        }
        reverse(nums, i + 1);
    }

    private static void reverse(int[] nums, int start) {
        int i = start, j = nums.length - 1;
        while (i < j) {
            swap(nums, i, j);
            i++;
            j--;
        }
    }

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[j];
        nums[j] = nums[i];
        nums[i]=temp;
    }

    public static void main(String[] args) {
        int[] arr= {1,3,2};
        nextPermutation(arr);
    }
}
