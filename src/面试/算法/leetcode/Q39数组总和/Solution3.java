package 面试.算法.leetcode.Q39数组总和;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 给定一个无重复元素的数组 candidates 和一个目标数 target ，找出 candidates 中所有可以使数字和为 target 的组合。
 *
 * candidates 中的数字可以无限制重复被选取。
 *
 * 说明：
 *
 * 所有数字（包括 target）都是正整数。
 * 解集不能包含重复的组合。 
 * 示例 1:
 *
 * 输入: candidates = [2,3,6,7], target = 7,
 * 所求解集为:
 * [
 *   [7],
 *   [2,2,3]
 * ]
 * 示例 2:
 *
 * 输入: candidates = [2,3,5], target = 8,
 * 所求解集为:
 * [
 *   [2,2,2,2],
 *   [2,3,3],
 *   [3,5]
 * ]
 */
public class Solution3 {
    //
    static List<List<Integer>> res = new ArrayList<>();
    public static List<List<Integer>> combinationSum(int[] candidates, int target) {

        //1 先排序，排特例
        Arrays.sort(candidates);
        if (candidates==null ){
            return res;
        }
        //2 回溯求解
        ArrayList<Integer> tmp = new ArrayList<>();
        findTruePath(candidates,target,tmp,0);
        return res;
    }

    private static void findTruePath(int[] candidates, int target,ArrayList<Integer> tmp,int index) {
        if (target<0){
            return;
        }
        if (target==0){
            res.add(new ArrayList<>(tmp));
            return;
        }

        for (int i = index; i <candidates.length ; i++) {
            tmp.add(candidates[i]);
            findTruePath(candidates,target-candidates[i],tmp,i);
            tmp.remove(tmp.size()-1);
        }
    }

    public static void main(String[] args) {
        int[] arr= {2,3,5};
        List<List<Integer>> lists = combinationSum(arr, 8);
        System.out.println(lists);
    }
}
