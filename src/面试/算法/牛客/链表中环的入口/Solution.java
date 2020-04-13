package 面试.算法.牛客.链表中环的入口;

public class Solution {
    public ListNode EntryNodeOfLoop(ListNode pHead)
    {
        ListNode fast = pHead;
        ListNode low  = pHead;
        while(fast!=null && fast.next!=null){
            fast = fast.next.next;
            low = low.next;
            if (fast==low){
                break;
            }
        }
        // 如果不相遇，就会返回null,到最后都没碰头
        if (fast==null||fast.next==null){
            return null;
        }
        // 这里是相遇的情况。
        low = pHead;
        while (fast!=low){
            fast= fast.next;
            low = low.next;
        }
        return low;
    }
}
