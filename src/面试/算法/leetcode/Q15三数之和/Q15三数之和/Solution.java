package 面试.算法.leetcode.Q15三数之和.Q15三数之和;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        List<List<Integer>> result = new ArrayList<>();
        if(n<3 || nums==null) return result;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]>0) break;
            if(i > 0 && nums[i]==nums[i-1]) continue;
            int l = i+1;
            int r = n-1;
            while(l<r){
                int sum = nums[l]+nums[r]+nums[i];
                if(sum==0){
                    result.add(Arrays.asList(nums[i],nums[l],nums[r]));
                    while (l<r && nums[l]==nums[l+1]) l++;
                    while (l<r && nums[r]==nums[r-1]) r--;
                    l++;
                    r--;
                }else if(sum<0){
                    l++;
                }else {
                    r--;
                }
            }
        }
        return result;
    }
}
