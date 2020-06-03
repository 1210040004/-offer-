package 面试.算法.leetcode.Q160相交链表;

import 面试.算法.牛客.链表中环的入口.ListNode;

import java.util.Stack;

public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        // 倒序来找就可以找到
        ListNode l1 = headA, l2 = headB;
        while (l1 != l2) {
            l1 = (l1 == null) ? headB : l1.next;
            l2 = (l2 == null) ? headA : l2.next;
        }
        return l1;
    }

    public ListNode getIntersectionNode2(ListNode headA, ListNode headB) {
        // 倒序来找就可以找到
        Stack<ListNode> s1 = new Stack<>();
        Stack<ListNode> s2 = new Stack<>();
        ListNode p1 = headA;
        ListNode p2 = headB;
        while(p1!=null){
            s1.push(p1);
            p1 = p1.next;
        }
        while(p2!=null){
            s2.push(p2);
            p2 = p2.next;
        }
        ListNode res = null;
        while(!s1.isEmpty() && !s2.isEmpty() && s1.peek()==s2.peek()){
            res = s1.pop();
            s2.pop();
        }
        return res;
    }


}
