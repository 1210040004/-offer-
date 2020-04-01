package 面试.算法.leetcode.Q4两个有序数组的中位数;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int[] arr = new int[m+n];
        int temp1=0;
        int temp2=0;
        for (int i = 0; i < arr.length; i++) {
            if (temp1<m){
                arr[i] = nums1[temp1++];
            }else {
                arr[i] = nums2[temp2++];
            }
        }
        int len = arr.length;
        Arrays.sort(arr);
        if (len%2==0){
            return (arr[len/2]+arr[len/2-1])/2.0;
        }
        return arr[(len-1)/2]/1.0;
    }
}
