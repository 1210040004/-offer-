package 面试.算法.实习.字节.每k个反转;

import 面试.算法.牛客.链表中环的入口.ListNode;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {

    public ListNode reverseKGroup(ListNode head, int k) {

        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode pre = dummy;
        ListNode end = dummy;
        while(end.next!=null){
            for (int i = 0; i <+ k && end!=null; i++) {
                end= end.next;
            }
            if (end == null) break;
            ListNode start = pre.next;
            ListNode next = end.next;
            end.next=null;
            pre.next = reverse(start);
            start.next= next;
            pre = start;
            end = start;
        }
        return dummy.next;
    }
    public ListNode reverse(ListNode head){
        ListNode pre = null;
        ListNode next= null;
        while(head!=null){
            next = head.next;
            head.next = pre;
            pre = head;
            head= next;
        }
        return pre;
    }

}
