package 面试.算法.leetcode.Q46排列问题;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Solution {
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> permute(int[] nums) {
        // 典型的回溯法解决问题
        if (nums.length==0){
            return res;
        }
        ArrayList<Integer> list = new ArrayList<>();
        generatePermutation(nums,0,list);
        return res;
    }

    /**
     *
     * @param nums
     * @param index
     * @param p // 递归过程中保存的排列
     */
    private void generatePermutation(int[] nums, int index ,ArrayList<Integer> p ){
        if (index == nums.length){
            res.add(new ArrayList<>(p));
            return ;
        }
        for (int i = 0; i < nums.length; i++) {
            if (!p.contains(nums[i])){
                p.add(nums[i]);
                generatePermutation(nums,index+1,p);
                p.remove(p.size()-1);
            }
        }
    }
}
