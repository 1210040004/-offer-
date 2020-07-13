package 面试.秋招.vivo提前批.Q3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
   static List<Integer> arr = new ArrayList<>();
    public static void main(String[] args) {

        List<String> lines = new ArrayList<>();
        Scanner sc = null;
        try {
            sc = new Scanner(System.in);
            while (sc.hasNextLine()) {
                int n = sc.nextInt();
                sc.nextLine();
                ListNode[] listNodes = new ListNode[n];
                for (int i = 0; i < listNodes.length; i++) {
                    listNodes[i] = parseLine(sc.nextLine());
                }
                Collections.sort(arr);
                for (Integer integer : arr) {
                    System.out.print(integer+" ");
                }
                ListNode listNode = mergeLists(listNodes);
                // 最后遍历输出
                while(listNode!=null){
                    System.out.print(listNode.val+" ");
                    listNode = listNode.next;
                }
            }
        } finally {
            if (sc != null) {
                sc.close();
            }
        }

        // TODO output

    }

    private static ListNode parseLine(String s) {
        ListNode dummy = new ListNode(-1);
        ListNode cur = dummy;
        String[] t = s.split(" ");
        for (int i = 0; i < t.length; i++) {
            int parseInt = Integer.parseInt(t[i]);
            arr.add(parseInt);
            cur.next = new ListNode(Integer.parseInt(t[i]));
            cur = cur.next;
        }
        return dummy.next;
    }

    static class ListNode {
        int val;

        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
    public static ListNode mergeLists(ListNode[] lists) {
        ListNode result = null;
        for (ListNode list: lists) {
            result = mergeTwoList(result, list);
        }
        return result;
    }

    private static ListNode mergeTwoList(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(-1);
        ListNode cur = dummy;
        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                cur.next = l1;
                l1 = l1.next;
            } else {
                cur.next = l2;
                l2 = l2.next;
            }
            cur = cur.next;
        }
        if (l1 ==null){
            cur.next = l2;
        }
        if (l2 == null){
            cur.next=l1;
        }
        return dummy.next;
    }
}