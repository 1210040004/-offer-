package 面试.算法.leetcode.Q23合并K个排列的链表;

import com.sun.deploy.util.StringUtils;

import java.util.ArrayList;
import java.util.Collections;

public class Solution1 {
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists==null || lists.length ==0){
            return null;
        }
        ListNode tmp = lists[0];
        for (int i = 1; i < lists.length; i++) {
             tmp = mergeTwo(tmp,lists[i]);
        }
        return tmp;
    }
    public ListNode mergeTwo(ListNode a,ListNode b){
        if (a==null){
            return  b;
        }
        if (b==null){
            return  a;
        }
        if (a.val<b.val){
            a.next = mergeTwo(a.next,b);
            return a;
        }else {
            b.next = mergeTwo(a,b.next);
            return b;
        }
    }
    public ListNode mergeKLists2(ListNode[] lists) {
        if (lists==null || lists.length==0){
            return  null;
        }
        ListNode dummy = new ListNode(-1);
        ListNode cur = dummy;
        while(true){
            ListNode nextList = null;
            int minindex = -1;
            for (int i = 0; i < lists.length; i++) {
                if (lists[i] == null){
                    continue;
                }
                if (nextList==null||nextList.val>lists[i].val){
                    nextList = lists[i];
                    minindex = i;
                }
            }
            if (minindex ==-1){
                break;
            }
            cur.next = nextList;
            cur = cur.next;
            lists[minindex] = lists[minindex].next;
        }
        return dummy.next;
    }
    public ListNode mergeKLists3(ListNode[] lists) {
        // 试试最恶心的做法
        ArrayList<Integer> list = new ArrayList<>();
        for (ListNode listNode : lists) {
            ListNode cur = listNode;
            while (cur!=null){
                list.add(cur.val);
                cur = cur.next;
            }
        }
        Collections.sort(list);
        ListNode dummy = new ListNode(-1);
        ListNode cur = dummy;
        for (Integer integer : list) {
            cur.next = new ListNode(integer);
            cur = cur.next;
        }
        return dummy.next;
    }
}
