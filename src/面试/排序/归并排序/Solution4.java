package 面试.排序.归并排序;

import java.util.Arrays;

public class Solution4 {

    public static void mergeSort(int[] arr, int left, int right ,int[] temp){
        if (left<right){
            int mid = (left+right)/2;
            mergeSort(arr,left,mid,temp);
            mergeSort(arr,mid+1,right,temp);
            merge(arr,left,mid,right,temp);
        }
    }


    public static void merge(int[] arr, int left , int mid, int high,int[] temp){
        int i = left;
        int j = mid+1;
        int t = 0;
        while (i<=mid && j<=high){
            if (arr[i]<arr[j]){
                temp[t++]=arr[i++];
            }else {
                temp[t++]=arr[j++];
            }
        }
        while (i<=mid) {
            temp[t++] = arr[i++];
        }
        while (j<=high){
            temp[t++] = arr[j++];
        }
        t = 0;
        int templeft = left;
        while(templeft<=high){
            arr[templeft++] = temp[t++];
        }
    }

    public static void main(String[] args) {
        int[] arr= {8,4,5,7,1,3,6,2,0,234};
        int[] temp = new int[arr.length];
        System.out.println("归并排序前"+ Arrays.toString(arr));
        mergeSort(arr,0,arr.length-1,temp);//需要额外的空间
        System.out.println("归并排序后"+ Arrays.toString(arr));
    }
}
