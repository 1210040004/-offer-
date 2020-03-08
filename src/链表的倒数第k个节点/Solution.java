package 链表的倒数第k个节点;

public class Solution {
    public  static  ListNode FindKthToTail(ListNode head, int k) {
        ListNode listNode = head;
        for (int i = 0; i < k; i++) {
            if (head==null){
                return null;
            }
            head = head.next;
        }
        while(head != null){
            head =head.next;
            listNode = listNode.next;
        }
        return listNode;
    }

    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(3);
        ListNode listNode4 = new ListNode(4);
        ListNode listNode5 = new ListNode(5);
        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;
        listNode4.next = listNode5;
        FindKthToTail(listNode1, 1);
    }
}
