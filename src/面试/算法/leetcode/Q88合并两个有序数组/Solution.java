package 面试.算法.leetcode.Q88合并两个有序数组;

import java.util.Arrays;

public class Solution {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        // nums2 合并到 nums1 中去
        for (int i = 0; i < n; i++) {
            nums1[m++]  = nums2[i];
        }

        Arrays.sort(nums1);
    }

    public static void main(String[] args) {
        int[] arr ={1,2,3,0,0,0};
        int[] nums2 = {2,5,6};
        merge(arr,3,nums2,3);
        System.out.println(Arrays.toString(arr));
    }
}
