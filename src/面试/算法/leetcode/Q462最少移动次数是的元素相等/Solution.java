package 面试.算法.leetcode.Q462最少移动次数是的元素相等;

import java.util.Arrays;

/**
 * 这是个典型的相遇问题，移动距离最小的方式是所有元素都移动到中位数。理由如下：
 *
 * 设 m 为中位数。a 和 b 是 m 两边的两个元素，且 b > a。要使 a 和 b 相等，它们总共移动的次数为 b - a，这个值等于 (b - m) + (m - a)，也就是把这两个数移动到中位数的移动次数。
 *
 * 设数组长度为 N，则可以找到 N/2 对 a 和 b 的组合，使它们都移动到 m 的位置。
 */
public class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int move = 0;
        int l = 0, h = nums.length - 1;
        while (l <= h) {
            move += nums[h] - nums[l];
            l++;
            h--;
        }
        return move;
    }
}
