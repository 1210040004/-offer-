package 面试.算法.leetcode.Q141链表有环;

import java.util.HashSet;

public class Solution2 {
    public boolean hasCycle(ListNode head) {
        HashSet<ListNode> set = new HashSet<>();
        while(head!=null){
            if (set.contains(head)){
                return true;
            }else {
                set.add(head);
            }
            head = head.next;
        }
        return false;
    }
    public boolean hasCycle2(ListNode head) {
        if (head == null){
            return false;
        }
        // 为什么要这一步呢？
        /**
         *
         */
        ListNode fast = head.next;
        ListNode slow = head;
        while(slow!=fast){
            if (fast==null ||fast.next==null){
                return false;
            }
            fast = fast.next.next;
            slow = slow.next;
        }
        return true;
    }
}
