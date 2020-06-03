package 面试.算法.牛客.数组排成最小的数;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Solution {
    public  static String PrintMinNumber(int [] numbers) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int number : numbers) {
            list.add(number);
        }
        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                String s1 = o1+""+o2;
                String s2 = o2+""+o1;
                return s1.compareTo(s2);
            }
        });
        StringBuilder sb=  new StringBuilder();
        for (Integer integer : list) {
            sb.append(integer);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        int[] arr = {3,32,321};
        String s = PrintMinNumber(arr);
        System.out.println(s);
    }
}
