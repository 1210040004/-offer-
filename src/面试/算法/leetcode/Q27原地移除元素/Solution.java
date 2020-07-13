package 面试.算法.leetcode.Q27原地移除元素;

public class Solution {
    public int removeElement(int[] nums, int val) {
        //原地算法
        int i = 0 ;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j]!=val){
                nums[i++] = nums[j];
            }
        }
        return i;
    }
}
