package 面试.算法.牛客.链表中环的入口;

public class Solution2 {
    public ListNode EntryNodeOfLoop(ListNode head)
    {
        ListNode fast =  head;
        ListNode slow =  head;
        while(fast!=null && fast.next!=null){
            fast= fast.next.next;
            slow = slow.next;
            if (fast==slow){
                break;
            }
        }
        if (fast==null ||fast.next==null){
            return null;
        }
        slow = head;
        while(fast!=slow){
            fast = fast.next;
            slow = slow.next;
        }
        return slow ;
    }
}
