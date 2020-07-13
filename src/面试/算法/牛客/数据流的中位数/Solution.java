package 面试.算法.牛客.数据流的中位数;

import java.util.HashMap;
import java.util.PriorityQueue;

/**
 * @author wcx
 */
public class Solution {
     // 中位数的左区间，大顶堆
    PriorityQueue<Integer> queue1 = new PriorityQueue<>(((o1, o2) -> (o2-o1)));
    // 中位数的右区间， 小顶堆
    PriorityQueue<Integer> queue2 = new PriorityQueue<>();
    // 数据流中的数字的个数
    int sum = 0;
    public void Insert(Integer num) {
        // 当前是偶数， 那么大顶堆和小顶堆里面的元素个数都是一样的
        if (sum%2 == 0){
            // 新增的元素优先放入大顶堆
            queue1.add(num);
        }else {
            queue2.add(num);
        }
        if (!queue1.isEmpty()&& !queue2.isEmpty() && (queue1.peek()>queue2.peek())){
            // 交换这两个数
            int tmp1 = queue1.poll();
            int tmp2 = queue2.poll();
            queue1.add(tmp2);
            queue2.add(tmp1);
        }
        sum++;
    }
    public Double GetMedian() {
        if (sum%2 == 1){
            return (double)queue1.peek();
        }else {
            return ((double)(queue1.peek())+(queue2.peek()))/2;
        }
    }

    public static void main(String[] args) {
        StringBuffer sf = new StringBuffer();
        sf.append(1);
        HashMap<Integer,Integer> map = new HashMap<>();
    }
}
