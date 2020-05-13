package 面试.算法.leetcode.Q78子集;

import java.util.ArrayList;
import java.util.List;

/**
 * 给定一组不含重复元素的整数数组 nums，返回该数组所有可能的子集（幂集）。
 *
 * 说明：解集不能包含重复的子集。
 *
 * 示例:
 *
 * 输入: nums = [1,2,3]
 * 输出:
 * [
 *   [3],
 *   [1],
 *   [2],
 *   [1,2,3],
 *   [1,3],
 *   [2,3],
 *   [1,2],
 *   []
 * ]
 */
public class Solution {
    static List<List<Integer>> res = new ArrayList<>();
    public static List<List<Integer>> subsets(int[] nums) {
        if (nums==null || nums.length==0){
            return res;
        }
        List<Integer> tmp = new ArrayList<>();
        res.add(tmp);// 先加一个空的list
        findTruePath(nums,0,tmp);
        return res;
    }

    private static void findTruePath(int[] nums,int start, List<Integer> tmp) {
        if (!doesResHasList(res,tmp)){
            res.add(new ArrayList<>(tmp));
            return;
        }
        for (int i = start; i < nums.length; i++) {
            tmp.add(nums[i]);
            findTruePath(nums,i+1,tmp);
            tmp.remove(tmp.size()-1);
        }
    }

    private  static boolean doesResHasList(List<List<Integer>> res, List<Integer> tmp) {
        for (List<Integer> re : res) {
            if (re.equals(tmp)){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] arr= {1,2,3};
        List<List<Integer>> subsets = s.subsets(arr);
        System.out.println(subsets);
//        ArrayList<Integer> integers = new ArrayList<>();
//        integers.add(1);
//        integers.add(2);
//        ArrayList<Integer> integers1 = new ArrayList<>();
//        integers1.add(1);
//        integers1.add(2);
//        res.add(integers1);
//        doesResHasList(res,integers);
    }
}
