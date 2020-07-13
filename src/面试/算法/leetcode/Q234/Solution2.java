package 面试.算法.leetcode.Q234;

import 面试.算法.牛客.链表中环的入口.ListNode;


public class Solution2 {
    public boolean isPalindrome(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while(fast!=null && fast.next !=null){
            fast =fast.next.next;
            slow = slow.next;
        }
        ListNode reverse = reverse(slow);
        fast = head;
        while(reverse!=null){
            if (fast.val!=reverse.val){
                return false;
            }
            fast =fast.next;
            slow = slow.next;
        }
        return true;
    }
    public  ListNode reverse(ListNode head){
        ListNode pre = null;
        ListNode next= null;
        while(head!=null){
            next = head.next;
            head.next = pre;
            pre = head;
            head = next;
        }
        return pre;
    }

    public static void main(String[] args) {
         Solution2 s= new Solution2();
         ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(2);
        ListNode l4 = new ListNode(1);
        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        s.isPalindrome(l1);

    }
}
