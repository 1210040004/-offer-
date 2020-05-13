package 面试.算法.leetcode.Q88归并两个有序数组;

public class Solution {
    public  static void merge(int[] nums1, int m, int[] nums2, int n) {
            m-=1;
            n-=1;
            int index = m+n-1;
            while(m>=0 || n>=0){
                if(m<0){
                    nums1[index--] = nums2[n--];
                }
                else if(n<0){
                    nums1[index--] = nums1[m--];
                }
                else if(nums1[m]>nums2[n]){
                    nums1[index--] = nums1[m--];
                }else{
                    nums1[index--] = nums2[n--];
                }
            }
    }
}
