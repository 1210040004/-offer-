package 面试.算法.牛客.合并两个排序的链表;


public class Solution {
    public static ListNode Merge(ListNode list1, ListNode list2) {
        if(list1==null){
            return list2;
        }
        if(list2==null){
            return list1;
        }
        if(list1.val<list2.val){
            list1.next=Merge(list1.next,list2);
            return list1;
        }else {
            list2.next=Merge(list2.next,list1);
            return  list2;
        }
    }

    public static void main(String[] args) {
        ListNode l1= new ListNode(1);
        ListNode l2= new ListNode(2);
        ListNode l3= new ListNode(3);
        ListNode l4= new ListNode(4);
        ListNode l5= new ListNode(5);
        ListNode l6= new ListNode(6);
        l1.next=l3;
        l3.next=l5;
        l2.next=l4;
        l4.next=l6;
        Merge(l1,l2);
    }
}
