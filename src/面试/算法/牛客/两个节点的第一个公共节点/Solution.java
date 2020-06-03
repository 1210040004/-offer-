package 面试.算法.牛客.两个节点的第一个公共节点;

import 面试.算法.牛客.链表中环的入口.ListNode;

import java.util.List;
import java.util.Stack;

public class Solution {
    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
        Stack<ListNode> s1 = new Stack<>();
        Stack<ListNode> s2 = new Stack<>();
        while(pHead1!=null){
            s1.add(pHead1);
            pHead1= pHead1.next;
        }
        while(pHead2!=null){
            s2.add(pHead2);
            pHead2 = pHead2.next;
        }
        ListNode pop =null;
        while(!s1.isEmpty() && !s2.isEmpty() && s1.peek()==s2.peek()){
            s1.pop();
            pop = s2.pop();
        }
        return pop;
    }
}
