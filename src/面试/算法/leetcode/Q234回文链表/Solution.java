package 面试.算法.leetcode.Q234回文链表;

import 面试.算法.牛客.链表中环的入口.ListNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class Solution {
    public static boolean isPalindrome(ListNode head) {
        ArrayList<Integer> list = new ArrayList<>();
        while(head!=null){
            list.add(head.val);
            head = head.next;
        }
        for (int i = 0; i < list.size()/2; i++) {
             if (list.get(i)!=(list.get(list.size()-1-i))){
                return false;
            }
        }
         return true;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(-129);
        ListNode l2 = new ListNode(-129);
        l1.next=l2 ;
        System.out.println(isPalindrome(l1));
    }
}
