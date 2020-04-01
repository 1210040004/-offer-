package 面试.算法.牛客.Q反转链表;

public class Solution {
    public static Node reverseNode(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node reHead = null;
        Node cur = head;
        while (cur != null) {
            Node curHead = cur;
            cur = cur.next;
            curHead.next = reHead;
            reHead = curHead;
        }
        return reHead;
    }
}
