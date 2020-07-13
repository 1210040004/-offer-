package 面试.算法.leetcode.Q82删除排序链表的重复元素;

import 面试.算法.牛客.链表中环的入口.ListNode;

import java.util.TreeSet;

public class Solution {
    public static ListNode deleteDuplicates(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        while(head!=null ){
           if (head.next!=null && head.val==head.next.val){
               head.next = head.next.next;
           }else {
               head = head.next;
           }
        }
        return dummy.next;
    }


    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(3);
        ListNode l4 = new ListNode(3);
        ListNode l5 = new ListNode(4);
        ListNode l6 = new ListNode(4);
        ListNode l7 = new ListNode(5);
        l1.next= l2;
        l2.next= l3;
        l3.next= l4;
        l4.next= l5;
        l5.next= l6;
        l6.next= l7;
        deleteDuplicates(l1);

    }
}
