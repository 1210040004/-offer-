package 面试.算法.leetcode.Q46全排列;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Solution1 {
    List<List<Integer>> res  =new ArrayList<>();
    public List<List<Integer>> permute(int[] nums) {
        LinkedList<Integer> list = new LinkedList<>();
        track(list,nums);
        return res;
    }

    private void track(LinkedList<Integer> list, int[] nums) {
        if (list.size() == nums.length ){
            res.add(new ArrayList<>(list));
            return ;
        }
        for (int i = 0; i < nums.length; i++) {
            if (list.contains(nums[i])){
                continue;
            }
            list.add(nums[i]);
            track(list,nums);
            list.removeLast();
        }
    }
}
