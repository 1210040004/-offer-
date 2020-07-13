package 面试.算法.leetcode.Q75颜色分类;

import static 面试.算法.实习.字节.缺失的第一个正数.Solution.swap;

public class Solution3 {
    public void sortColors(int[] nums) {
        /**
         * 一次遍历就能完成
         * 双指针法
         */
        // 原地排序法 按照0 1 2 排序实现
        // i 左侧都是0 j右侧都是2
        // 扫描一遍的做法
        //
        int l = 0;
        int n = nums.length;
        int r = n-1;
        while (l<r){
            while (l<r && nums[l] == 0){
                l++;
            }
            while (l<r && nums[r]!=0) {
                r--;
            }
            if (l<r){
                swap(nums,l,r);
                l++;
                r--;
            }
        }
        r = n-1;
        l = 0;
        while (l<r && nums[l]==0){
            l++;
        }
        while (l<r){
            while (l<r && nums[l] == 1){
                l++;
            }
            while (l<r && nums[r]!=1) {
                r--;
            }
            if (l<r){
                swap(nums,l,r);
                l++;
                r--;
            }
        }
    }
    public static  void swap(int[] arr,int i ,int j ){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
