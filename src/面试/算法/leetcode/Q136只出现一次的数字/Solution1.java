package 面试.算法.leetcode.Q136只出现一次的数字;

public class Solution1 {
    public int singleNumber(int[] nums) {
        int tmp = 0;
        for (int num : nums) {
            tmp = tmp ^ num;
        }
        return tmp;
    }
}
