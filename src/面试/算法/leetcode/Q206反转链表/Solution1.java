package 面试.算法.leetcode.Q206反转链表;

import 面试.算法.牛客.链表中环的入口.ListNode;

public class Solution1 {
    public ListNode reverseList(ListNode head) {
        ListNode pre = null;
        ListNode next = null;
        while(head!=null){
            next = head.next;
            head.next = pre;
            pre = head;
            head = next;
        }
        return pre;
    }
}
