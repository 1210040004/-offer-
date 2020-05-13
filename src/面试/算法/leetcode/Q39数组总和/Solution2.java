package 面试.算法.leetcode.Q39数组总和;

import java.util.ArrayList;
import java.util.List;

public class Solution2 {
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        if (candidates.length==0 || candidates==null){
            return res;
        }
        int start = 0;
        List<Integer> list = new ArrayList<>();
        generateList(start,candidates,list,target);
        return res;
    }

    private void generateList(int start, int[] candidates, List<Integer> list, int target) {
        if (target<0){
            return;
        }
        if (target==0){
            res.add(new ArrayList<>(list));
            return;
        }
        for (int i = start; i < candidates.length; i++) {
            list.add(candidates[i]);
            generateList(i,candidates,list,target-candidates[i]);
            list.remove(list.size()-1);
        }
    }

    public static void main(String[] args) {
        Solution2 s = new Solution2();
        int[] arr= {2,3,6,7};
        int target =7;
        List<List<Integer>> lists = s.combinationSum(arr, 7);
    }
}
