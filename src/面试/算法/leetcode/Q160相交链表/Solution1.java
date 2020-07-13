package 面试.算法.leetcode.Q160相交链表;

import 面试.算法.牛客.链表中环的入口.ListNode;

import java.util.Stack;

public class Solution1 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        Stack<ListNode> stack1 = new Stack<>();
        Stack<ListNode> stack2 = new Stack<>();
        while(headA!=null){
            stack1.add(headA);
            headA = headA.next;
        }
        while (headB!=null){
            stack2.add(headB);
            headB = headB.next;
        }
        ListNode res = null;
        while (!stack1.isEmpty() && !stack2.isEmpty()&& stack1.peek()==stack2.peek()){
            res = stack1.pop();
            stack2.pop();
        }
        return res;
    }
}
