package 面试.算法.尚硅谷刷题.数据结构.链表.面试题.链表的个数;

public class Solution2 {


        static class Node{
            int val;
            Node next;
            public Node(int val) {
                this.val = val;
            }
        }
        public static void reverseNode(Node head){
            if(head.next.next==null||head.next==null){
                return;
            }
            Node reverseHead = new Node(0);
            Node next=null;
            Node cur= head.next;
            while(cur!=null){
               next= cur.next;
               cur.next=reverseHead.next;
               reverseHead.next=cur;
               cur=next;
            }
            head.next=reverseHead.next;
        }

    public static void main(String[] args) {
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        node1.next=node2;
        node2.next=node3;
        node3.next=node4;
        reverseNode(node1);

    }
    }
