package 面试.排序.归并排序;

import java.util.Arrays;

public class Solution7 {


    public static  void MergeSort(int[] arr, int left , int right , int[] temp ){
        if (left<right){
            int mid = (left+right)/2;
            MergeSort(arr,left,mid,temp);
            MergeSort(arr,mid+1,right,temp);
            merge(arr,left,mid,right,temp);
        }
    }

    public  static  void merge(int[] arr,int left, int mid ,int high, int[] temp){
        int i = left;
        int j = mid+1;
        if (i>j){
            return;
        }
        int k = 0;
        while(i<=mid && j<=high){
            if (i<=mid && j<=high && arr[i]<arr[j]){
                temp[k++] =arr[i++];
            }else {
                temp[k++] =arr[j++];
            }
        }
        while(i<=mid){
            temp[k++] = arr[i++];
        }
        while(j<=high){
            temp[k++] = arr[j++];
        }
        int leftPtr = left;
        k = 0;
        while(leftPtr<=high){
            arr[leftPtr++] = temp[k++];
        }
    }

    public static void main(String[] args) {
        int[] arr= {8,4,5,7,1,3,6,2,0,234};
        int[] temp = new int[arr.length];
        System.out.println("归并排序前"+ Arrays.toString(arr));
        MergeSort(arr,0,arr.length-1,temp);//需要额外的空间
        System.out.println("归并排序后"+ Arrays.toString(arr));
    }
}
