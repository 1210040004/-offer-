package 面试.排序.归并排序;

import java.util.Arrays;

public class Solution5 {



    public static  void Mergesort(int[] arr, int low ,int high,int[] temp){
        if (low<high){
            int mid = (low+high)/2;
            Mergesort(arr,low, mid,temp);
            Mergesort(arr,mid+1,high,temp);
            merge(arr,low,mid,high,temp);
        }
    }

    public static void merge(int[] arr, int low ,int mid , int high ,int[] temp){
        int i = low;
        int j = mid+1;
        int k = 0;
        while(i<=mid && j<=high){
            if (i<=mid && arr[i]<arr[j]){
                temp[k++] = arr[i++];
            } else {
                temp[k++] =  arr[j++];
            }
        }
        while(i<=mid){
            temp[k++] = arr[i++];
        }
        while (j<=high){
            temp[k++] = arr[j++];
        }
        k = 0 ;
        int leftP= low;
        while (leftP <= high){
            arr[leftP++] = temp[k++];
        }
    }

    public static void main(String[] args) {
        int[] arr= {8,4,5,7,1,3,6,2,0,234};
        int[] temp = new int[arr.length];
        System.out.println("归并排序前"+ Arrays.toString(arr));
        Mergesort(arr,0,arr.length-1,temp);//需要额外的空间
        System.out.println("归并排序后"+ Arrays.toString(arr));
    }
}
