package 面试.算法.leetcode.Q665非递减数列;

import java.util.ArrayList;

public class Solution {
    public static boolean checkPossibility(int[] nums) {
        // 改变一个数成为非递减数列
        int index = -1;
        int count = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i]<nums[i-1]){
                index = i-1;
                count++;
            }
        }
        if (count==0){
            return true;
        }
        if (count==1){
            if (index==0 || nums[index-1]<=nums[index+1] ){
                return true;
            }else {
                return false;
            }
        }
        else return false;
    }

    public static void main(String[] args) {
        int[] arr= {2,3,3,2,4};
        System.out.println(checkPossibility(arr));
    }
}
