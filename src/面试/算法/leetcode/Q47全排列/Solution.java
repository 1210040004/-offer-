package 面试.算法.leetcode.Q47全排列;

import 面试.算法.面试算法.平方数组成的数最少个数.Soultion2;

import java.util.*;

public class Solution {
        List<List<Integer>> res = new ArrayList<>();
        Set<List<Integer>> temp = new HashSet<>();
        public List<List<Integer>> permuteUnique(int[] nums) {
            if (nums==null||nums.length==0){
                return res;
            }
            ArrayList<Integer> list = new ArrayList<>();
            generatePermutation(nums,0,list);
            for (List<Integer> integers : temp) {
                res.add(integers);
            }
            return res;
        }

    private void generatePermutation(int[] nums, int index, ArrayList<Integer> list) {
            if (index == nums.length){
                temp.add(new ArrayList<>(list));
            }
             for (int i = 0; i <nums.length; i++) {
             if (!list.contains(nums[i]))
            {
                list.add(nums[i]);
                generatePermutation(nums,index+1,list);
                list.remove(list.size()-1);
            }
        }
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] arr= {1,1,2};
        List<List<Integer>> lists = s.permuteUnique(arr);
    }
}
