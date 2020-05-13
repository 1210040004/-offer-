package 面试.算法.leetcode.Q2两数相加;

public class Solution2 {
    public  static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode cur = dummy;
        int carry = 0;
        int val1 = 0;
        int val2 = 0;
        while (l1!=null || l2!=null){
            val1 = (l1==null) ? 0 : l1.val;
            val2 = (l2==null) ? 0 : l2.val;
            cur.next = new ListNode((carry+val1+val2) % 10 );
            carry = (carry+val1 + val2)/10;
            cur = cur.next;
            if(l1!=null){
                l1 = l1.next;
            }
            if(l2 !=null){
                l2 = l2.next;
            }
        }
        if (carry!=0){
            cur.next = new ListNode(1);
        }
        return dummy.next;
    }
    public static void main(String[] args) {
        ListNode l1 =new ListNode(1);
        ListNode l2 =new ListNode(8);
        ListNode l3 =new ListNode(0);
        l1.next=l2;

        addTwoNumbers(l1,l3);
    }
}
