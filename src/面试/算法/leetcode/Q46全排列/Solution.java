package 面试.算法.leetcode.Q46全排列;

import java.util.LinkedList;
import java.util.List;

public class Solution {
   static List<List<Integer>> res = new LinkedList<>();
    public static List<List<Integer>> permute(int[] nums) {
        // 数字的全排列
        LinkedList<Integer> track  = new LinkedList<>();
        backTrach(nums, track);
        return res;

    }
    // 记录在track中，
    // 选择列表： nums 不存在track 的那些元素
    // 结束条件： nums 中的元素全都在track中出现
    private static void backTrach(int[] nums, LinkedList<Integer> track) {
        if(track.size() == nums.length) {
            res.add(new LinkedList(track));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            // 排除不符合法的选择
            if (track.contains(nums[i])){
                continue;
            }
            track.add(nums[i]);
            //进入下一层决策树;
            backTrach(nums,track);
            // 取消选择
            track.removeLast();
        }

    }


}
