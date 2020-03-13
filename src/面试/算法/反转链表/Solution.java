package 面试.算法.反转链表;

import java.util.Stack;

public class Solution {
    public ListNode ReverseList(ListNode head) {
        Stack<Integer> stack = new Stack<>();
        while(head!=null){
            stack.push(head.val);
            head = head.next;
        }
        ListNode res = new ListNode(stack.pop());
        while(!stack.isEmpty()){
            res.next = new ListNode(stack.pop());
        }
        return res;
    }
}
