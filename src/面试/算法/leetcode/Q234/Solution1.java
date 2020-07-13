package 面试.算法.leetcode.Q234;

import 面试.算法.牛客.链表中环的入口.ListNode;

import java.util.ArrayList;

public class Solution1 {
    public boolean isPalindrome(ListNode head) {
        ArrayList<Integer> list = new ArrayList< >();
        while(head!=null){
            list.add(head.val);
            head= head.next;
        }
        int left = 0 ;
        int right = list.size()-1;
        while(left<right){
            if (!list.get(left).equals(list.get(right))){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public boolean isPalindrome2(ListNode head) {
        ListNode fast =head;
        ListNode slow = head;
        while(fast!=null && fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
        }
        ListNode reverse = reverse(slow);
        fast = head;
        while(fast!=null){
            if (fast.val!=reverse.val){
                return false;
            }
            fast = fast.next;
            reverse = reverse.next;
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
