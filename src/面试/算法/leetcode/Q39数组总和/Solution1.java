package 面试.算法.leetcode.Q39数组总和;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Solution1 {
    List<List<Integer>> res= new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        //1 先排序，排特例
        Arrays.sort(candidates);
        if (candidates==null ){
            return res;
        }
        Helper(0,candidates,target,new LinkedList<Integer>());
        return res;
    }

    private void Helper(int start, int[] candidates, int target, LinkedList<Integer> tmp) {
        if (target<0){
            return;
        }
        if (target==0){
            res.add(new ArrayList<>(tmp));
            return;
        }

        for (int i = start; i < candidates.length; i++) {
            tmp.add(candidates[i]);
            Helper(start, candidates,target-candidates[i],tmp);
            tmp.remove(tmp.size()-1);
        }
    }
}
