package 面试.排序.快速排序;

import java.util.Arrays;

import static 面试.排序.冒泡排序.Solution.swap;

public class Solution2 {
    public static  void quickSort(int[] arr, int low , int high){
        int i = low ;
        int j = high;
        if (i>j){
            return;
        }
        int k = arr[i]; // 基准数
        while(i<j){
            // 先从后面开始找，再从前面找顺序不可变
            while(i<j && arr[j]>k){
                j--;
            }
            while(i<j && arr[i]<=k){
                i++;
            }

            if (i<j){
                swap(arr,i,j);
            }
        }
        swap(arr,i,low);
        quickSort(arr,low,i-1);
        quickSort(arr,i+1,high);
    }

    public static void main(String[] args) {
        int[] arr= new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random()*100);
        }   System.out.println(Arrays.toString(arr));
        int[] temp= new int[10];



        quickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
