package 面试.算法.牛客.删除链表中的重复节点;

import 面试.算法.牛客.链表中环的入口.ListNode;

public class Solution {
    public ListNode deleteDuplication(ListNode pHead) {
        if (pHead == null || pHead.next==null){
            return pHead;
        }
        ListNode next = pHead.next;
        if (pHead.val==next.val){
            while(next!=null && pHead.val==next.val){
                next = next.next;
            }
            return deleteDuplication(next);
        }else {
            pHead.next = deleteDuplication(next);
            return pHead;
        }
    }
}
