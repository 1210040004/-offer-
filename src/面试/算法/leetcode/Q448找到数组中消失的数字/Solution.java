package 面试.算法.leetcode.Q448找到数组中消失的数字;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Solution {
    public static  List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> res = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        for (int i = 1; i <= nums.length; i++) {
            if (!set.contains(i)){
                res.add(i);
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int[] arr= {4,3,2,7,8,2,3,1};
        List<Integer> disappearedNumbers = findDisappearedNumbers(arr);
        for (Integer disappearedNumber : disappearedNumbers) {
            System.out.println(disappearedNumber);
        }
    }
}
