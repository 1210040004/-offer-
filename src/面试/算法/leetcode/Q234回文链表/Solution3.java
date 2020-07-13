package 面试.算法.leetcode.Q234回文链表;

import 面试.算法.牛客.链表中环的入口.ListNode;

/**
 *  第二种解法， 维持了一半的数据
 */
public class Solution3 {
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next ==null){
            return true;
        }
        ListNode fast = head;
        ListNode slow = head;
        while(fast!=null && fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
        }
        ListNode reverse = reverse(slow);
        while(reverse!=null){
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

}
