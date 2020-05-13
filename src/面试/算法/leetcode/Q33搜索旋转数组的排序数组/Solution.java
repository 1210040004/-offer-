package 面试.算法.leetcode.Q33搜索旋转数组的排序数组;

public class Solution {
    public  static int search(int[] nums, int target) {
        int h = nums.length;
        int l = 0;
        while(l<=h){
            int mid  = (h+l)/2;
            if(nums[mid] == target){
                return mid;
            }

            // 前半部分有序
            if(nums[l] <= nums[mid] ){
                //target 在前半部分
               if(target>=nums[l] && target<nums[mid]){
                   h =mid-1;
               }else {
                   l = mid +1;
               }
            }
            else{
                if (target <= nums[h] && target > nums[mid]) {
                    h = mid + 1;
                } else {
                    h = mid - 1;
                }

            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr= {4,5,6,7,0,1,2};
        int target = 4;

        search(arr,target);
    }
}
