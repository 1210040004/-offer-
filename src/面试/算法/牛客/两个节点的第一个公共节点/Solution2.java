package 面试.算法.牛客.两个节点的第一个公共节点;

import 面试.算法.牛客.链表中环的入口.ListNode;

public class Solution2 {
    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
        ListNode l1 = pHead1;
        ListNode l2 = pHead2;
        while(l1!=l2){
            l1 =(l1==null)? pHead2:l1.next;
            l2 = (l2==null)? pHead1:l2.next;
        }
        return l2;
    }
}