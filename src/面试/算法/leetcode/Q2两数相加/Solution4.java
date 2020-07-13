package 面试.算法.leetcode.Q2两数相加;

public class Solution4 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
         int flag = 0 ;
         ListNode dummy = new ListNode(-1);
         ListNode cur = dummy;
         while(l1!=null || l2!=null){
             int v1 = l1==null? 0: l1.val;
             int v2 = l2==null? 0: l2.val;
             int res = v1+v2+flag;
             flag = res/10;
             res = res%10;
             cur.next = new ListNode(res);
             cur = cur.next;
             if (l1 != null) {
                 l1 = l1.next;
             }
             if (l2!=null){
                 l2 = l2.next;
             }
         }
         if (flag!=0){
             cur.next = new ListNode(flag);
         }
         return dummy.next;
    }
}
