package 面试.算法.尚硅谷刷题.数据结构.链表.面试题.链表的个数;

import java.awt.*;

public class Solution {
    static class Node{
        int val;
        Node next;
        public Node(int val) {
            this.val = val;
        }
    }
//    public static void getLengthOfNode(Node ndoe){
//        if(he)
//    }
    public static  void reverseNode(Node head){
        //1 先定义一个节点reverseHead = new HeroNode();

        //3 原来的链表的head.next = reverseHead.next
        // 如果当前链表为null 或者 只有i一个节点，就无需反转，直接返回
        if(head==null |head.next==null){
            return;
        }
        // 定义一个辅助指针，变量，帮助我们遍历原来的链表
        Node  cur = head.next;
        // 指向当前节点的下一个节点
        Node next=null;
        //
        Node reverseHead = new Node(0);
        //2 从头到尾遍历原来的链表,每遍历一个节点就取出，并放在新的链表reverseNode的最前端
        while (cur!=null){
            // 保留当前节点的下一个节点
            next=cur.next;
            cur.next=reverseHead.next; // 将current 的节点指向新的链表的最前端
            reverseHead.next=cur;// 将cur连接到新的链表上
            cur=next;// cur指向下一个节点
        }
        head.next=reverseHead.next;
    }
}
