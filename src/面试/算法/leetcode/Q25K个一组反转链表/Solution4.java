package 面试.算法.leetcode.Q25K个一组反转链表;

import 面试.算法.牛客.链表中环的入口.ListNode;

public class Solution4 {
    public ListNode reverseKGroup(ListNode head, int k) {
        if (head == null){
            return null;
        }
        ListNode a ,b ;
        a= b = head;
        for (int i = 0; i < k; i++) {
            if (b == null){
                return head;
            }
            b = b.next;
        }
        ListNode newHead = reverse(a,b);
        a.next =  reverseKGroup(b,k);
        return newHead;
    }
    public ListNode reverse(ListNode a,ListNode b){
        ListNode next = null;
        ListNode pre = null;
        while(a!=b){
            next = a.next;
            a.next = pre;
            pre = a;
            a = next;
        }
        return pre;
    }
}
