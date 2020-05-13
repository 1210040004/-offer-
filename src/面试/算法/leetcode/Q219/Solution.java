package 面试.算法.leetcode.Q219;

import java.util.Arrays;

public class Solution {
    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        int i=0;
        int j=i+k;
        while(j<nums.length){
            if(nums[i]==nums[j]){
                return true;
            }
            i++;
            j++;
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr= {1,2,3,1};
        int k =3;
        System.out.println(containsNearbyDuplicate(arr, k));
    }
}
