package 面试.排序.快速排序;

import java.util.Arrays;

import static 面试.排序.冒泡排序.Solution.swap;

public class Solution5 {
    public  static  void quickSort(int[] arr, int left,int right){
        if (left>right){
            return;
        }
        int i = left;
        int j = right;
        int k = arr[left];
        while (i<j){
            while (i<j && arr[j]>k){
                j--;
            }
            while(i<j && arr[i]<=k){
                i++;
            }
            if (i<j){
                swap(arr,i,j);
            }
        }
        swap(arr,left,i);
        quickSort(arr,left,i-1);
        quickSort(arr,i+1,right);
    }

    public static void main(String[] args) {
        int[] arr= new int[20];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random()*100);
        }   System.out.println(Arrays.toString(arr));




        quickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
