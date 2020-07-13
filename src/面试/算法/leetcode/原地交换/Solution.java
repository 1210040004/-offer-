package 面试.算法.leetcode.原地交换;

import java.util.Arrays;

public class Solution {
    public static  void swapArr(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            if (i==arr.length-1){
                arr[arr.length-1] = -1;
                break;
            }
            int max = Integer.MIN_VALUE;
            for (int j = i+1; j <arr.length ; j++) {
                max  = Math.max(max,arr[j]);
            }
            arr[i] = max;
        }
    }

    public static void main(String[] args) {
        int[] arr = {16,17,4,3,5,2};
        swapArr(arr);
        System.out.println(Arrays.toString(arr));
    }
}
