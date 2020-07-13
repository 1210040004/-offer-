package 面试.算法.leetcode.Q300最长上升子序列;

public class Solution1 {
    public static int lengthOfLIS(int[] nums) {
        // 暴力法
        int res = 0;
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            int tmp = nums[i];
            int len = 1;
            for (int j = i; j < n ; j++) {
                if (nums[j]>tmp){
                    len++;
                    tmp = nums[j];
                }
            }
            res = Math.max(res,len);
        }
        return res;
    }
    public static int lengthOfLIS2(int[] nums) {
        // 暴力法
        int res = 0;
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            int tmp = nums[i];
            int len = 1;
            for (int j = i; j < n ; j++) {
                if (nums[j]>tmp){
                    len++;
                    tmp = nums[j];
                }
            }
            res = Math.max(res,len);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {10,9,2,5,3,7,101,18};
        int[] arr1 = {10,9,2,5,3,4};
        System.out.println(lengthOfLIS(arr1));
        System.out.println();
    }
}
