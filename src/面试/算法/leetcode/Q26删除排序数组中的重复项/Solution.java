package 面试.算法.leetcode.Q26删除排序数组中的重复项;

public class Solution {
    public static int removeDuplicates(int[] nums) {
        if (nums==null || nums.length==0){
            return 0;
        }
        int i = 0 ;
        for (int j = 1; j < nums.length; j++) {
            if (nums[i]!=nums[j]){
                nums[++i] = nums[j];
            }
        }
        return i+1;
    }

    public static void main(String[] args) {
        int[] arr = {1,1,2};
        System.out.println(removeDuplicates(arr));
    }
}
