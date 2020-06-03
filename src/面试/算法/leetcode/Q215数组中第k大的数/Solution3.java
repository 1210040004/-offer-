package 面试.算法.leetcode.Q215数组中第k大的数;

import java.util.PriorityQueue;

public class Solution3 {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for (int num : nums) {
             queue.add(num);
             if (queue.size()>k) {
                 queue.poll() ;
             }
        }
        return queue.peek();
    }
}
