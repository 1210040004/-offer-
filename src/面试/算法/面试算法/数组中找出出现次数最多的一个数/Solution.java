package 面试.算法.面试算法.数组中找出出现次数最多的一个数;

import java.util.*;

public class Solution {
    public static  int findMaxNum (int[] arr){
        if (arr.length==0 || arr==null){
            throw new RuntimeException("有问题");
        }
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i],map.containsKey(arr[i]) ? map.get(arr[i])+1:1);
        }
        Collection<Integer> values = map.values();
        int max = Collections.max(values);
        Set<Map.Entry<Integer, Integer>> entries = map.entrySet();
        for (Map.Entry<Integer, Integer> entry : entries) {
            if (entry.getValue()==max){
                return entry.getValue();
            }
        }
        throw new RuntimeException(" 没找到");
    }

    public static void main(String[] args) {
        int[] arr= {1,1,1,2,2,3,4,5};
        System.out.println(findMaxNum(arr));
    }
}

