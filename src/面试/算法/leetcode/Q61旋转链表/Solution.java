package 面试.算法.leetcode.Q61旋转链表;

import 面试.算法.牛客.链表中环的入口.ListNode;

public class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        int len = 0 ;
        ListNode fast = head;
        ListNode slow = head;
        while(k>0){
            fast = fast.next;
            k--;
        }
        ListNode pre = fast;
        while(fast.next!=null){
            fast = fast.next;
        }
        fast.next = slow;
        return pre;
    }
}
