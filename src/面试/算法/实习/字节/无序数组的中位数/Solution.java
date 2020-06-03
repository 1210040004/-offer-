package 面试.算法.实习.字节.无序数组的中位数;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Solution {
    public  static int getMidNum(int[] arr){
        int heapsize= arr.length/2+1;
        PriorityQueue<Integer> queue = new PriorityQueue<>(arr.length / 2 + 1, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });
        for (int i = 0; i < heapsize; i++) {
            queue.add(arr[i]);
        }
        for (int i = heapsize; i <arr.length ; i++) {
            if (queue.peek()>arr[i]){
                queue.poll();
                queue.add(arr[i]);
            }
        }
        return queue.peek();
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int midNum = getMidNum(arr);
        System.out.println(midNum);
    }
}
