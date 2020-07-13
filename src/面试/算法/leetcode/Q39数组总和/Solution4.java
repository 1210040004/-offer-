package 面试.算法.leetcode.Q39数组总和;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution4 {
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        if (candidates== null || candidates.length == 0){
            return res;
        }
        helper(0,candidates,target, new ArrayList<Integer>());
        return res;
    }

    private void helper(int start, int[] candidates, int target, ArrayList<Integer> tmp) {
        if (target<0){
            return;
        }
        if (target == 0){
            res.add(new ArrayList<>(tmp));
            return;
        }
        for (int i = start; i < candidates.length; i++) {
            tmp.add(candidates[i]);
            helper(i,candidates,target-candidates[i],tmp);
            tmp.remove(tmp.size()-1);
        }
    }

    public static void main(String[] args) {
        Solution4 s = new Solution4();
        int[] arr= {2,3,6,7};
        int target = 7;
        s.combinationSum(arr,target);
    }
}
