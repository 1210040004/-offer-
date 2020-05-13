package 面试.算法.leetcode.Q216组合总和;

import java.util.ArrayList;
import java.util.List;

/**
 * 找出所有相加之和为 n 的 k 个数的组合。组合中只允许含有 1 - 9 的正整数，并且每种组合中不存在重复的数字。
 *
 * 说明：
 *
 * 所有数字都是正整数。
 * 解集不能包含重复的组合。 
 * 示例 1:
 *
 * 输入: k = 3, n = 7
 * 输出: [[1,2,4]]
 * 示例 2:
 *
 * 输入: k = 3, n = 9
 * 输出: [[1,2,6], [1,3,5], [2,3,4]]
 */
public class Solution {
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> combinationSum3(int k, int n) {
        int[] nums = new int[10];
        for (int i = 1; i <=9 ; i++) {
            nums[i] = i;
        }
        // k 个数的组合
        ArrayList<Integer> tmp = new ArrayList<>();
        findTruePath(nums, n,1,k, tmp);
        return res;
    }

    private void findTruePath(int[] nums, int target,int start ,int k, ArrayList<Integer> tmp) {
        // k个数的组合
        if ((tmp.size()>=k && target!=0) || (target<0)){
            return;
        }
        if (tmp.size()==k && target==0){
            res.add(new ArrayList<>(tmp));
            return;
        }
        for (int i = start; i < nums.length; i++) {
            tmp.add(nums[i]);
            findTruePath(nums,target-nums[i],i+1,k,tmp);
            tmp.remove(tmp.size()-1);
        }
    }
}
