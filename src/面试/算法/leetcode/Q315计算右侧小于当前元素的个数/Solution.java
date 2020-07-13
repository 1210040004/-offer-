package 面试.算法.leetcode.Q315计算右侧小于当前元素的个数;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> countSmaller(int[] nums) {
        List<Integer> res = new ArrayList<>();
        if (nums == null || nums.length<1){
            return  res;
        }
        for (int i = 0; i < nums.length; i++) {
            int tmp = nums[i];
            int count = 0 ;
            for (int j = i+1; j < nums.length  ; j++) {
                if (nums[j]<tmp){
                    count++;
                }
            }
            res.add(count);
        }
        return res;
    }
}
