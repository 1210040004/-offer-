package 面试.算法.实习.字节.归并排序;

import java.util.Arrays;

public class Solution {

    public  static  void merge(int[] arr, int left , int right ,int[] temp){
        if (left<right){
            int mid = (left+right)/2;
            merge(arr,left,mid,temp);
            merge(arr,mid+1,right,temp);
            mergeSort(arr,left,mid,right,temp);
        }
    }

    public static void mergeSort(int[] arr, int left, int mid ,int right ,int[] temp){
        int i = left;
        int j = mid+1;
        int t = 0;
        while(i<=mid && j<=right){
            if (arr[i]<=arr[j]){
                temp[t++] = arr[i++];
            }
            else {
                temp[t++] =arr[j++];
            }
        }
        while(i<=mid){
            temp[t++] = arr[i++];
        }
        while (j<=right){
            temp[t++] = arr[j++];
        }
        int leftPtr = left;
        t = 0;
        while(leftPtr<=right){
            arr[leftPtr++] = temp[t++];
        }
    }

    public static void main(String[] args) {
        int[] arr= new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random()*100);
        }   System.out.println(Arrays.toString(arr));
        int[] temp= new int[10];
        merge(arr,0,arr.length-1,temp);
        System.out.println(Arrays.toString(arr));
    }

}
