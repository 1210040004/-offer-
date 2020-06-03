package 面试.算法.实习.字节.快排;

import java.util.Arrays;

import static 面试.算法.实习.字节.缺失的第一个正数.Solution.swap;

public class Solution2 {
    public static void quickSort(int[] arr, int left ,int right){
        if (left>right){
            return;
        }
        int pivot = arr[left];
        int i = left;
        int j = right;
        while(i<j){
            while(i<j && arr[j]>pivot){
                j--;
            }
            while (i<j && arr[i]<=pivot){
                i++;
            }
            if (i<j){
                swap(arr,i,j);
            }
        }
        swap(arr,j,left);
        quickSort(arr,left,i-1);
        quickSort(arr,i+1,right);
    }

    public static void main(String[] args) {
        int[] arr ={2,3,6,5,4,9,8,7};
        quickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
