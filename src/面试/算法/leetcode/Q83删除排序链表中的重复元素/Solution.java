package 面试.算法.leetcode.Q83删除排序链表中的重复元素;

import 面试.算法.牛客.链表中环的入口.ListNode;

public class Solution {
    public static ListNode deleteDuplicates(ListNode head) {
        
        ListNode res = head;
        while(head!=null){
            if (head.next!=null && head.val == head.next.val){
                head.next = head.next.next;
            }else {
                head = head.next;
            }
        }
        return  res;
    }

    public static void main(String[] args) {
        ListNode l1 =new ListNode(1);
        ListNode l2 = new ListNode(1);
        ListNode l3 = new ListNode(2);
        l1.next = l2 ;
        l2.next = l3;
        deleteDuplicates(l1);
    }
}
