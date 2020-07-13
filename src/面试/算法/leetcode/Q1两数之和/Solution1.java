package 面试.算法.leetcode.Q1两数之和;

public class Solution1 {
    public static int[] twoSum(int[] nums, int target) {
        int left = 0;
        int right = nums.length-1;
        while(left<right){
            int sum = nums[left]+nums[right];
            if(sum == target){
                return new int[]{left,right};
            }else if(sum<target){
                left++;
            }else if(sum>target){
                right--;
            }
        }
        return new int[]{-1,-1};
    }

    public static void main(String[] args) {
        int[] arr ={3,2,4};
        int target = 6;
        System.out.println(twoSum(arr, target));
    }
}
