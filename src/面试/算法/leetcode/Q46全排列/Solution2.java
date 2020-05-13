package 面试.算法.leetcode.Q46全排列;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution2 {
    static List<List<Integer>> res= new ArrayList<>();
    public static List<List<Integer>> permute(int[] nums) {
        if (nums.length==0){
            return res;
        }
        // 先排序
        Arrays.sort(nums);
        ArrayList<Integer> tmp = new ArrayList<>();
        findTruePath(nums,tmp );
        return res;
    }

    private static void findTruePath(int[] nums, ArrayList<Integer> tmp) {
        if (tmp.size() == nums.length){
            res.add(new ArrayList<>(tmp));
            return;
        }
            for (int i = 0; i < nums.length; i++) {
             if (tmp.contains(nums[i])){
                 continue;
             }
             tmp.add(nums[i]);
             findTruePath(nums,tmp);
             tmp.remove(tmp.size()-1);
            }
    }


    public static void main(String[] args) {
        int[] arr= {1,2,3};
        List<List<Integer>> permute = permute(arr);
        System.out.println(permute);
    }
}
