package 面试.算法.leetcode.Q19删除链表的倒数第N个节点;

public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dymmy = new ListNode(0);
        dymmy.next= head;
        int length = 0;
        ListNode first = head;
        while(first!=null){
            length++;
            first=first.next;
        }
        length-=n;
        first=dymmy;
        while (length>0){
            length--;
            first=first.next;
        }
        first.next= first.next.next;
        return dymmy.next;
    }
}
