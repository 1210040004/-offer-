package 面试.算法.实习.华为.快排;

import java.util.Arrays;

import static 面试.算法.实习.字节.缺失的第一个正数.Solution.swap;

public class Solution {
    public static void quickSort(int[] arr, int left ,int right){
        // 找到pivot的正确位置
        if (left>=right){
            return;
        }
        int i = left;
        int j = right;
        int pivot = arr[i];
        while(i<j){
            while(i<j && arr[j]>pivot){
                j--;
            }
            while(i<j && arr[i]<=pivot){
                i++;
            }
            if (i<j){
                swap(arr,i,j);
            }
        }
        swap(arr,left,j);
        quickSort(arr,left,i-1);
        quickSort(arr,i+1,right);
    }

    public static void main(String[] args) {
        int[] arr= {3,2,4,5,7,1,8,10};
        quickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
