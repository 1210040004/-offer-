package 面试.算法.leetcode.Q328奇偶链表;

import 面试.算法.牛客.链表中环的入口.ListNode;

public class Solution{
    public ListNode oddEvenList(ListNode head) {
        if (head==null){
            return head;
        }
        ListNode odd= head, even = head.next, evenhead= even;
        while(even!=null && even.next !=null){
            odd.next = odd.next.next;
            odd= odd.next;
            even.next = even.next.next;
            even = even.next;
        }
        odd.next = evenhead;
        return head;
    }
}
