package 面试.算法.leetcode.Q83删除排序链表中的重复元素;

import 面试.算法.牛客.链表中环的入口.ListNode;

public class Solution2 {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        while(head!=null){
            if (head!=null && head.val == head.next.val){
                head.next = head.next.next;
            }else {
                head = head.next;
            }
        }
        return dummy.next;
    }
}
