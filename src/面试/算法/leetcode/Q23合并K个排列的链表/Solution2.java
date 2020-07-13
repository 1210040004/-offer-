package 面试.算法.leetcode.Q23合并K个排列的链表;

import org.omg.PortableServer.POA;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Solution2 {
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length <1){ ;
           return null;
        }
        if (lists.length == 1){
            return  lists[0];
        }
        ListNode tmp = lists[0];
        for (int i = 1; i < lists.length; i++) {
            tmp = merge2List(tmp,lists[i]);
        }
        return  tmp;
    }
    public ListNode merge2List(ListNode l1, ListNode l2){
        // 先递归版本
        if (l1 == null){
            return l2;
        }
        if (l2 ==null){
            return l1;
        }
        if (l1.val< l2.val){
            l1.next =merge2List(l1.next,l2);
            return l1;
        }else{
            l2.next = merge2List(l1,l2.next);
            return l2;
        }
    }
    // 最笨的方法， 先写一个merge2， 然后两两比较
    // mergeTwoSortedList想的是
    public ListNode mergeKLists2(ListNode[] lists) {
        int k = lists.length;
        ListNode dummyHead = new ListNode(0);
        ListNode tail = dummyHead;
        while (true) {
            ListNode minNode = null;
            int minPointer = -1;
            for (int i = 0; i < k; i++) {
                if (lists[i] == null) {
                    continue;
                }
                if (minNode == null || lists[i].val < minNode.val) {
                    minNode = lists[i];
                    // 发生移动的那个 list的index
                    minPointer = i;
                }
            }
            if (minPointer == -1) {
                break;
            }
            tail.next = minNode;
            tail = tail.next;
            lists[minPointer] = lists[minPointer].next;
        }
        return dummyHead.next;
    }


    public ListNode mergeKLists3(ListNode[] lists) {
        int k = lists.length;
        ListNode dummy  = new ListNode(0);
        ListNode head = dummy;
        while(true){
            ListNode minNode = null;
            int minPtr = -1;
            for (int i = 0; i < k; i++) {
                if (lists[i] == null) {
                    continue;
                }
                if (minNode == null || lists[i].val < minNode.val) {
                    minNode = lists[i];
                    minPtr = i;
                }
            }
            if (minPtr== -1){
                break;
            }
            head.next = minNode;
            head = head.next;
            lists[minPtr] = lists[minPtr].next;
        }
        return dummy.next;
    }
}
