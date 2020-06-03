package 面试.算法.牛客.调整奇数位置位于偶数前面;

import java.util.ArrayList;
import java.util.List;

public class Solution2 {
    public void reOrderArray(int [] array) {
        if (array==null || array.length<=1){
            return;
        }
        List<Integer>  odd = new ArrayList<>();
        List<Integer> even = new ArrayList<>();
        for (int i : array) {
            if (i%2 ==1 ){
                odd.add(i);
            }else {
                even.add(i);
            }
        }
        odd.addAll(even);
        for (int i = 0; i < array.length; i++) {
            array[i] =odd.get(i);
        }
    }
}
