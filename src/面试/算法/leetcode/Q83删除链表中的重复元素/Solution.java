package 面试.算法.leetcode.Q83删除链表中的重复元素;

import java.util.TreeSet;

public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode cur = head;
        TreeSet<Integer> set = new TreeSet<>();
        while (cur!=null){
            set.add(cur.val);
            cur= cur.next;
        }
        ListNode res = new ListNode(-1);
        ListNode caozuo = res.next;
        for (Integer i : set) {
            caozuo.next = new ListNode(i);
            caozuo = caozuo.next;
        }
        return res.next;
    }
}
