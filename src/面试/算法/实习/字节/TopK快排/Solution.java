package 面试.算法.实习.字节.TopK快排;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Random;

// 第k小的数
public class Solution {

    public static int trueNum(int[] arr, int k){
        Arrays.sort(arr);
        return arr[k-1];
    }

    public static int getTopK(int[] arr,int k){
        if (arr==null || arr.length<k){
            return 0;
        }
        PriorityQueue<Integer> queue = new PriorityQueue<>(arr.length-k-1, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });
        for (int i : arr) {
            if (queue.size()<arr.length-k+1){
                queue.offer(i);
            }
            else {
                if (queue.peek()<i){
                    queue.poll();
                    queue.offer(i);
                }
            }
        }
        return queue.peek();
    }

    public static void main(String[] args) {
        int[] arr = {35, 82, 50, 19, 68, 14, 91, 59, 48, 26};
//        System.out.println(Arrays.toString(arr));
//        System.out.println(trueNum(arr, 3));
        System.out.println(getTopK(arr,3));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
