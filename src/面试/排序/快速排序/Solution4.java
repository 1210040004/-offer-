package 面试.排序.快速排序;


import java.util.Arrays;

import static 面试.排序.冒泡排序.Solution.swap;

public class Solution4 {
    public static  void QuickSort(int[] arr, int low, int high){
        int i = low;
        int j = high;
        if (i>j){
            return;
        }
        int k = arr[low];
        while(i<j){
            while(i<j && arr[j]>k){
                j--;
            }
            while (i<j && arr[i]<=k){
                i++;
            }
            if (i<j){
                swap(arr,i,j);
            }
        }
        swap(arr,i,low);
        QuickSort(arr,low,i-1);
        QuickSort(arr,i+1,high);
    }

    public static void main(String[] args) {
        int[] arr= new int[20];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random()*100);
        }   System.out.println(Arrays.toString(arr));
        int[] temp= new int[20];



        QuickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
