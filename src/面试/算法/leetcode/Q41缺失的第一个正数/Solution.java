package 面试.算法.leetcode.Q41缺失的第一个正数;

public class Solution {
    public int firstMissingPositive(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            while(nums[i]>1 && nums[i]<=nums.length && nums[i] !=nums[nums[i]-1]){
                swap(nums,i,nums[i]-1);
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if ((i+1)!=nums[i]){
                return i+1;
            }
        }
        return nums.length+1;
    }
    public static  void swap(int[] arr,int i ,int j ){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
