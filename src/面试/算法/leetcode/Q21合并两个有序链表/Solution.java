package 面试.算法.leetcode.Q21合并两个有序链表;

public class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        // 先递归版本
        if (l1 == null){
             return l2;
        }
        if (l2 ==null){
            return l1;
        }
        if (l1.val< l2.val){
            l1.next =mergeTwoLists(l1.next,l2);
            return l1;
        }else{
            l2.next = mergeTwoLists(l1,l2.next);
            return l2;
        }
    }
    public ListNode mergeTwoLists2(ListNode l1, ListNode l2) {
        // 非递归版
        ListNode dummy = new ListNode(0);
        ListNode cur = dummy;
        while(l1!=null && l2!=null){
            if (l1.val< l2.val){
                cur.next = l1;
                cur = cur.next;
                l1 = l1.next;
            }else {
                cur.next = l2 ;
                cur = cur.next;
                l2 = l2 .next;
            }
        }
        if (l1 ==null){
            cur.next = l2;
        }
        else {
            cur.next =l1;
        }
        return  dummy.next;
    }
}
