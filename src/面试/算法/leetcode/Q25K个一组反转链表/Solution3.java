package 面试.算法.leetcode.Q25K个一组反转链表;

import 面试.算法.牛客.链表中环的入口.ListNode;

import java.util.ArrayDeque;
import java.util.Deque;

public class Solution3 {
    public ListNode reverseKGroup(ListNode head, int k) {
        Deque<ListNode>  stack = new ArrayDeque<>();
        ListNode dummy = new ListNode(0);
        ListNode pre = dummy;
        while(true){
            int count = 0;
            ListNode tmp = head;
            while(tmp!=null && count<k){
                stack.add(tmp);
                tmp= tmp.next;
                count++;
            }
            if (count!=k){
                //说明到头了，不需要反转
                pre.next = head;
                break;
            }
            // 说明需要反转
            while(!stack.isEmpty()){
                pre.next = stack.pollLast();
                pre = pre.next;
            }
            pre.next = tmp;
            head = tmp;
        }
        return  dummy.next;
    }
}
