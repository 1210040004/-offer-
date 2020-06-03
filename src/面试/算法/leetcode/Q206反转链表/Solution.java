package 面试.算法.leetcode.Q206反转链表;

import 面试.算法.牛客.链表中环的入口.ListNode;

import java.util.Stack;

public class Solution {
    public ListNode reverseList(ListNode head) {
        if (head==null){
            return null;
        }
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
    public ListNode reverseList2(ListNode head) {
        // 用栈的方式来实现也可以
        if (head == null){
            return null;
        }
        Stack<ListNode> list = new Stack<>();
        while (head!=null){
            list.push(head);
            head= head.next;
        }
        ListNode res = new ListNode(-1  );
        ListNode reverse = res;
        while(!list.isEmpty()){
            res.next = new ListNode(list.pop().val);
            res = res.next;
        }
        return reverse.next;
    }
}
