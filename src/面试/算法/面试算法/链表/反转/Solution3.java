package 面试.算法.面试算法.链表.反转;

import java.util.Scanner;

public class Solution3 {


    public static ListNode ReverseList(ListNode head) {
        if (head == null){
            return null;
        }
        ListNode pre = null;
        ListNode next;
        while(head!=null){
            next = head.next;
            head.next = pre ;
            pre = head;
            head = next;
        }
        return pre;
    }
    public static void main(String[] args) {

        ListNode a = new ListNode(1);
        ListNode b = new ListNode(2);
        ListNode c = new ListNode(3);
        ListNode d = new ListNode(4);
        ListNode e = new ListNode(5);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        ReverseList(a);
        while (e != null) {
            System.out.println(e.val);
            e = e.next;
        }
    }
}
