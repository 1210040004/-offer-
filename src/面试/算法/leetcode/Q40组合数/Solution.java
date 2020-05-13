package 面试.算法.leetcode.Q40组合数;

import 面试.算法.leetcode.Q39数组总和.Solution2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> combinationSum2(int[] candidates, int target){
        Arrays.sort(candidates);
        if (candidates.length==0 || candidates==null || target<0){
            return res;
        }
        List<Integer> list = new ArrayList<>();
        generateCombination(0,candidates,target,list);
        return res;
    }

    private void generateCombination(int start, int[] candidates, int target, List<Integer> list) {
        if (target<0){
            return ;
        }
        if (target==0){
            res.add(new ArrayList<>(list));
            return;
        }
        for (int i = start; i < candidates.length; i++) {
            if (i>start && candidates[i]==candidates[i-1]){
                continue;
            }
            list.add(candidates[i]);
            generateCombination(i+1,candidates,target-candidates[i],list);
            list.remove(list.size()-1);
        }
    }
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] arr= {10,1,2,7,6,1,5};
        int target =8;
        List<List<Integer>> lists = s.combinationSum2(arr, target);
        for (List<Integer> list : lists) {
            for (Integer integer : list) {
                System.out.print(integer+"  ");
            }
            System.out.println();
        }
    }
}
