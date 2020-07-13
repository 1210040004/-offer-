package 面试.算法.leetcode.Q234回文链表;

import 面试.算法.牛客.链表中环的入口.ListNode;

public class Solution4 {
    /**
     * 不需要维持链表
     *
     * @param head
     * @return
     */
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null){
            return true;
        }
        // 一块一慢两个指针，为了找到需要翻转的半条链表的起点。遍历半个链表
        ListNode slow = head;
        ListNode fast = head;
        // 用于辅助反转前半个链表
        ListNode pre = null;
        while(fast!=null && fast.next!=null){
            ListNode cur = slow;
            slow = slow.next;
            cur.next = pre;
            pre = cur;
        }
        if (fast!=null){
            slow = slow.next;
        }
        while(pre!=null){
            if (pre.val!=slow.val){
                return  false;
            }
            pre.next = slow .next;
            pre = pre.next;
        }
        return true;
    }
}
