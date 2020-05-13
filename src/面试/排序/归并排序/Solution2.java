package 面试.排序.归并排序;

import java.util.Arrays;

public class Solution2 {

    public static void main(String[] args) {
        int[] arr= new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random()*100);
        }   System.out.println(Arrays.toString(arr));
        int[] temp= new int[10];
        mergeSort(arr,0,arr.length-1,temp);
        System.out.println(Arrays.toString(arr));
    }


    public static  void mergeSort(int[] arr, int left,int right, int[] temp){

        if(left<right){
            int mid = (right+left)/2;
            mergeSort(arr,left,mid,temp);
            mergeSort(arr,mid+1,right,temp);
            merge(arr,left,mid,right,temp);
        }
    }

    public static  void merge(int[] arr,int left, int mid , int right ,int[] temp){
        int i = left;
        int j = mid+1;
        int t = 0;
        while(i<=mid && j<=right){
            if (arr[i]<=arr[j]){
                temp[t++] = arr[i++];
            }else {
                temp[t++] = arr[j++];
            }
        }
        while (i<=mid) {
            temp[t++] = arr[i++];
        }
        while(j<=right){
            temp[t++] = arr[j++];
        }
        t= 0;
        int tempLeft= left;
        while(tempLeft<=right){
            arr[tempLeft++] = temp[t++];
        }
    }
}
