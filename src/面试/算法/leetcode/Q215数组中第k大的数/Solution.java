package 面试.算法.leetcode.Q215数组中第k大的数;

import java.util.Arrays;
import java.util.PriorityQueue;

public class Solution {
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length-k];
    }
    public int findKthLargest2(int[] nums, int k) {
        // 维护一个优先级队列， 保证在队列的第一个元素最小。
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int num : nums) {

            pq.add(num);
            //维护一个长度为k的优先队列
            if (pq.size()>k){
                 //
                pq.poll();
            }
        }
        return  pq.peek();
    }
//    public int findKthLargest3(int[] nums, int k) {
//
//    }
}
