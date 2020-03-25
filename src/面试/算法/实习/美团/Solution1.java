package 面试.算法.实习.美团;

import java.util.*;

public class Solution1 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list1.add(sc.nextInt());
        }
        for (int i = 0; i < n; i++) {
            list2.add(sc.nextInt());
        }
        Collections.sort(list1);
        Collections.sort(list2);
        int totalList1 = countList(list1);
        int totalList2 = countList(list2);
        System.out.println(Math.max(totalList1,totalList2));
    }
    public static int countList(List<Integer> list){
        int size = list.size();
        if(size>=3){
            return list.get(size-1)+list.get(size-2)+list.get(size-3);
        }
        return 0;
    }
}
