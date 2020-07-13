package 面试.算法.leetcode.单链表奇数递增偶数递减排序后使升序;

import 面试.算法.TreeNode;
import 面试.算法.牛客.链表中环的入口.ListNode;

import java.util.Stack;

public class Solution {
    public static ListNode sortListNode(ListNode root){
        ListNode cur = root;
        ListNode reverse = createNewList(cur);
        ListNode res = merge2List(root, reverse);
        return res;
    }

    private static ListNode createNewList(ListNode cur) {
        Stack<Integer> stack  = new Stack<>();
        while(cur!=null){
            stack.add(cur.val);
            cur = cur.next;
        }
        ListNode dummy = new ListNode(0);
        ListNode move = dummy;
        while (!stack.isEmpty()){
            move.next = new ListNode(stack.pop());
            move = move.next;
        }
        return dummy.next;
    }

    public static  ListNode reverse(ListNode root){
        ListNode pre = null;
        ListNode next = null;
        while(root!=null){
           next = root.next;
           root.next = pre;
           pre = root;
           root = next;
        }
        return pre;
    }
    public static ListNode merge2List(ListNode l1 ,ListNode l2){
        // l1 是奇数,l2 是偶数


        while(l1!=null && l1.val%2!=1){
            l1 = l1.next;
        }
        while(l2!=null && l2.val%2!=0){
            l2 = l2.next;
        }
        ListNode sortList = new ListNode(-1);
        ListNode cur = sortList;
        if (l1.val<l2.val){
            cur.next = l1;
            cur.next = merge2List(l1.next,l2);
        }else {
            sortList = new ListNode(l2.val);
            sortList.next = merge2List(l1,l2.next);
        }
        return sortList;
    }

    public static void main(String[] args) {
        ListNode l1=  new ListNode(1);
        ListNode l2=  new ListNode(2);
        ListNode l3=  new ListNode(3);
        ListNode l4=  new ListNode(4);
        ListNode l5=  new ListNode(5);
        ListNode l6=  new ListNode(6);
        ListNode l7=  new ListNode(7);
        ListNode l8=  new ListNode(8);
        l1.next = l8;
        l8.next = l3;
        l3.next = l6;
        l6.next = l5;
        l5.next = l4;
        l4.next = l7;
        l7.next = l2;
        ListNode listNode = sortListNode(l1);
        while(listNode!=null){
            System.out.println(listNode.val);
            listNode = listNode.next;
        }
    }
}
