package 面试.算法.leetcode.Q39数组总和;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        if (candidates==null || candidates.length==0 || target<=0){
            return res;
        }
        List<Integer> list = new ArrayList<>();
        process(0,candidates,target,list);
        return res;
    }

    private void process(int start,int[] candidates, int target, List<Integer> list) {
        if (target < 0) {
            return;
        }
        if (target == 0) {
            res.add(new ArrayList<>(list));
            return;
        }
        for (int i = start; i < candidates.length; i++) {
            list.add(candidates[i]);
            process(i,candidates, target - candidates[i], list);
            list.remove(list.size()-1);
        }
    }
}
