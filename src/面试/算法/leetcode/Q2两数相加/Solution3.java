package 面试.算法.leetcode.Q2两数相加;

public class Solution3 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode cur = dummy;
        int flag= 0;
        while(l1!=null ||l2!=null){
            int v1 = l1==null?0:l1.val;
            int v2 = l2==null?0:l2.val;
            int sum =v1+v2+flag;
            cur.next = new ListNode(sum%10);
            flag = sum/10;
            cur = cur.next;
            if (l1!=null){
                l1 = l1.next;
            }
            if (l2!=null){
                l2 = l2.next;
            }
        }
        if (flag !=0){
            cur.next = new ListNode(flag);
        }
        return dummy.next;
    }
}
