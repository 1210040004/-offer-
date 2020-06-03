package 面试.算法.牛客.最小的K个数;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Solution1 {
    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        ArrayList<Integer> res = new ArrayList<>();
        if (input.length==0 || input==null || k<=0 || k>input.length){
            return res;
        }
        PriorityQueue<Integer> queue = new PriorityQueue<>(k, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        });
        for (int i = 0; i < input.length; i++) {
            if (queue.size()!=k){
                queue.add(input[i]);
            }else if (queue.peek()>input[i]){
                Integer poll = queue.poll();
                poll = null;
                queue.offer(input[i]);
            }
        }
        for (int i = 0; i < k; i++) {
            res.add(queue.poll());
        }
        return res;
    }
}
