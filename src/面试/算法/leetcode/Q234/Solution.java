package 面试.算法.leetcode.Q234;

import 面试.算法.牛客.链表中环的入口.ListNode;

public class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow = slow.next;
        }
        fast = head;
        ListNode reverse = reverse(slow);
        while(reverse!=null){
            if (reverse.val!=fast.val){
                return false;
            }
            reverse= reverse.next;
            fast = fast.next;
        }
        return true;
    }
    public ListNode reverse(ListNode head){
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
