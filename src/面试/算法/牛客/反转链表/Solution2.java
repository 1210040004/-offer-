package 面试.算法.牛客.反转链表;
// 反转链表后输出新的链表的表头
public class Solution2 {
    public ListNode ReverseList(ListNode head) {
        if (head == null) {
            return null;
        }

        ListNode pre = null;
        ListNode next = null;
        ListNode current = head;
        while (current != null) {
            next = current.next;
            current.next = pre;
            pre = current;
            current = next;
        }
        return pre;
    }
}
