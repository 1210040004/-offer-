package 面试.算法.leetcode.Q26删除排序数组中的重复项;

public class Solution2 {
    public int removeDuplicates(int[] nums) {
        // 快慢指针法解决问题
        if (nums== null|| nums.length == 0){
            return  0;
        }
        int slow = 0 ;
        int fast = 1;
        int n = nums.length;
        while(fast<n){
            if (nums[fast] != nums[slow]){
                slow ++;
                nums[slow] = nums[fast];
            }
            fast++;
        }
        return slow+1;
    }
}
