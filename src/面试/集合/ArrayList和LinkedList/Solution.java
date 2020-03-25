package 面试.集合.ArrayList和LinkedList;

import java.util.ArrayList;
import java.util.LinkedList;

public class Solution {
    public static void main(String[] args) {
        ArrayList<Integer> list =new ArrayList<>();
        LinkedList<Integer> linkedList =new LinkedList<>();
        for (int i = 0; i < 1000000; i++) {
            list.add(i);
            linkedList.add(i);
        }
        long StartTime = System.currentTimeMillis();
        for (Integer integer : list) {
            System.out.println(integer);
        }
        long EndTime = System.currentTimeMillis();
        System.out.println((EndTime-StartTime)/1000);

        long StartTime1 = System.currentTimeMillis();
        for (Integer integer : linkedList) {
            System.out.println(integer);
        }
        long EndTime1  = System.currentTimeMillis();
        System.out.println((EndTime1-StartTime1)/1000);
    }
}
