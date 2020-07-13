package 面试.算法.leetcode.Q86分割链表;

import 面试.算法.牛客.链表中环的入口.ListNode;

import java.util.ArrayList;

public class Solution {
    /**
     * 给定一个链表和一个特定值 x，对链表进行分隔，使得所有小于 x 的节点都在大于或等于 x 的节点之前。
     *
     * 你应当保留两个分区中每个节点的初始相对位置。
     *
     * 示例:
     *
     * 输入: head = 1->4->3->2->5->2, x = 3
     * 输出: 1->2->2->4->3->5
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/partition-list
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     * @param head
     * @param x
     * @return
     */
    public static ListNode partition(ListNode head, int x) {
        ArrayList<Integer> left = new ArrayList<>();
        ArrayList<Integer> right = new ArrayList<>();
        while(head!=null){
            if (head.val<x){
                left.add(head.val);
            }
            else if (head.val>x ){
                right.add(head.val);
            }
            head = head.next;
        }
        ListNode dummy = new ListNode(-1);
        ListNode cur = dummy.next;
        for (Integer i : left) {
            cur = new ListNode(i);
            cur = cur.next;
        }
        cur = new ListNode(x);
        cur = cur.next;
        for (Integer i : right) {
            cur = new ListNode(i);
            cur = cur.next;
        }
        return dummy.next;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(4);
        ListNode l3 = new ListNode(3);
        ListNode l4 = new ListNode(2);
        ListNode l5 = new ListNode(5);
        ListNode l6 = new ListNode(2);
        l1.next= l2;
        l2.next= l3;
        l3.next= l4;
        l4.next= l5;
        l5.next= l6;
        partition(l1,3);
    }
}
