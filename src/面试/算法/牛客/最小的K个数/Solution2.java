package 面试.算法.牛客.最小的K个数;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution2 {
    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        Arrays.sort(input);
        ArrayList<Integer> res = new ArrayList<>();
        if (k>input.length){
            return res;
        }
        for (int i = 0; i < k; i++) {
            res.add(input[i]);
        }
        return res;
    }
}
