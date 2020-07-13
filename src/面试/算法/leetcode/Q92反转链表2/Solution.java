package 面试.算法.leetcode.Q92反转链表2;

import 面试.算法.牛客.链表中环的入口.ListNode;

public class Solution {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        for (int i = 0; i < m; i++) {
            head = head.next;
        }
        ListNode next = head.next;
        ListNode cur = next;
        for (int i = 0; i < n; i++) {
            cur= cur.next;
        }
        ListNode lnext = cur.next;
        return lnext;

    }
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
