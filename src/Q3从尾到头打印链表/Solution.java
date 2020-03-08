package Q3从尾到头打印链表;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Stack;

public class Solution {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> list = new ArrayList<>();
        while(listNode!=null){
            list.add(listNode.val);
            listNode=listNode.next;
        }
        Collections.reverse(list);
        return list;
    }
    public ArrayList<Integer> printListFromTailToHead2(ListNode listNode) {
        // 先进后出
        Stack<Integer> stack = new Stack<>();
        while(listNode!=null){
            stack.push(listNode.val);
            listNode=listNode.next;
        }
        ArrayList<Integer> list = new ArrayList<>();
        while(!stack.isEmpty()){
            list.add(stack.pop());
        }
        return list;
    }
}
