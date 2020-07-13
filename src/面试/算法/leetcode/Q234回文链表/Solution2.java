package 面试.算法.leetcode.Q234回文链表;

import 面试.算法.牛客.链表中环的入口.ListNode;

public class Solution2 {
    public boolean isPalindrome(ListNode head) {
        if (head==null || head.next==null){
            return true;
        }
        ListNode reverse = reverse(head);
        while(head!=null){
            if (head.val!=reverse.val){
                return false;
            }
            head = head.next;
            reverse = reverse.next;
        }
        return true;
    }
    public static ListNode reverse(ListNode head){
        ListNode  pre= null;
        ListNode next = null;
        while(head!=null){
            next = head.next;
            head.next = pre;
            pre = head;
            head = next;
        }
        return pre;
    }

    public boolean isPalindrome3(ListNode head) {
        if (head == null || head.next == null)
            return true;

        ListNode slow = head; // 一块一慢两个指针，为了找到需要翻转的半条链表的起点。遍历半个链表
        ListNode fast = head;
        ListNode pre = null; // 用于辅助翻转前半条链表
        while (fast != null && fast.next != null) {
            ListNode cur = slow;
            slow = slow.next;
            fast = fast.next.next;
            cur.next = pre;
            pre = cur;
        }
        if (fast != null) slow = slow.next;
        while (pre != null) {
            // 两个半长链表的比较 遍历两个 半长链表
            if (pre.val != slow.val)
                return false;
            slow = slow.next;
            pre = pre.next;
        }
        return true;
    }

}
