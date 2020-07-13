package 面试.算法.leetcode.Q209长度最小的子数组;

import java.util.LinkedList;
import java.util.Queue;

public class Solution2 {
    public int minSubArrayLen(int s, int[] nums) {
        int l = 0 , h = 0 ,min = Integer.MAX_VALUE, sum = 0;
        while(h<nums.length){
            sum+=nums[h++];
            while(sum>=s){
                 min = Math.min(min,h-l);
                 sum-=nums[l++];
            }
        }return min == Integer.MAX_VALUE ? 0 : min;
    }

}
