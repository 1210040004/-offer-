package 面试.算法.leetcode.Q23合并K个排列的链表;

public class Solution {
    public ListNode mergeKLists(ListNode[] lists) {

        if (lists.length==1){
            return lists[0];
        }
        if (lists.length==2){
            return mergeTwoLists(lists[0],lists[1]);
        }
        ListNode head = new ListNode(0);
        ListNode cur = head;
        cur = mergeTwoLists(lists[0],lists[1]);
        for (int i = 2; i < lists.length; i++) {
            cur=mergeTwoLists(cur,lists[i]);
        }
        return cur;
    }
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        }
        else if (l2 == null) {
            return l1;
        }
        else if (l1.val < l2.val) {
            l1.next = mergeTwoLists(l1.next, l2);
            return l1;
        }
        else {
            l2.next = mergeTwoLists(l1, l2.next);
            return l2;
        }

    }
}
