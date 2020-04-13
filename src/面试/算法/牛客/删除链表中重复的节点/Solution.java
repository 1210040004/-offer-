package 面试.算法.牛客.删除链表中重复的节点;

public class Solution {
    public ListNode deleteDuplication(ListNode pHead)
    {
        if (pHead==null || pHead.next==null){
            return pHead;
        }
        if (pHead.val==pHead.next.val){ // 如果当前值是重复节点
            ListNode pNode = pHead.next;
            while (pNode!=null && pNode.val==pHead.val){
                //跳过与当前节点相同的全部系欸但，找到第一个与当前节点不同的系欸但
                pNode= pNode.next;
            }
            return deleteDuplication(pNode); // 从第一个与当前节点不同的系欸但开始递归
        }else {// 当前节点不是重复节点
            pHead.next= deleteDuplication(pHead.next); // 保留当前系欸但，从下一个节点开始递归
            return  pHead;
        }
    }
    public ListNode deleteDuplication2(ListNode pHead){
        if (pHead==null || pHead.next==null){return pHead;}
        ListNode Head = new ListNode(0);
        Head.next = pHead;
        ListNode pre  = Head;
        ListNode last = Head.next;
        while (last!=null){
            if(last.next!=null && last.val == last.next.val){
                // 找到最后的一个相同节点
                while (last.next!=null && last.val == last.next.val){
                    last = last.next;
                }
                pre.next = last.next;
                last = last.next;
            }else{
                pre = pre.next;
                last = last.next;
            }
        }
        return Head.next;
    }
}
