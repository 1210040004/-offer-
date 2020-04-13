package 面试.算法.尚硅谷刷题.排序.选择排序;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int[] arr = {9,8,7,6,5,4,3,2,1};
        choosesort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void choosesort(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            int minIndex = i;
            int j = i+1;
            for (; j < arr.length; j++) {
                if (arr[j]<arr[i]){
                    minIndex=j;
                }
            }
            if (minIndex!=i){
                swap(arr,i,minIndex);
            }
        }
    }

    private  static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
