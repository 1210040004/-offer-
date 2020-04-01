package 面试.算法.面试算法.链表.反转;

import java.util.Stack;

public class Solution {
    public static Node mergeList(Node list1 , Node list2) {
        if(list1==null){
            return list2;
        }
        if (list2==null){
            return list1;
        }
        Node head=null;
        if(list1.val<list2.val){
            head=list1;
            head.next=mergeList(list1.next,list2);
        }
        else {
            head=list2;
            head.next=mergeList(list1,list2.next);
        }
        return head;
    }

    public static void main(String[] args) {
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(1);
        Node n5 = new Node(3);
        Node n6 = new Node(4);
        n1.next=n2;
        n2.next=n3;
        n4.next=n5;
        n5.next=n6;
        mergeList(n1,n4);


    }


    public int JumpFloor(int n) {
        if(n<=2){
            return n;
        }
        int first = 1;
        int second = 2 ;
        int  third = 0;
        for(int i=3;i<=n;i++){
            third = first + second;
            first = second;
            second = third;
        }
        return third;
    }
}


