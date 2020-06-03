package 面试.排序.快速排序;

import java.util.Arrays;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.AbstractQueuedSynchronizer;
import java.util.concurrent.locks.ReentrantLock;

import static 面试.排序.冒泡排序.Solution.swap;

public class Solution6 {
    public  static  void quickSort(int[] arr, int low , int high){
        if (low>high){
            return;
        }
        int com = arr[low];
        int i = low;
        int j = high;
        while(i<j){
            while(i<j && arr[j]>com){
                j--;
            }
            while (i < j && arr[i] <= com) {
                i++;
            }
            if (i<j){
                swap(arr,i,j);
            }
        }
        swap(arr,low,i);
        quickSort(arr,low,i-1);
        quickSort(arr,i+1,high);
    }

    public static void main(String[] args) {
        int[] arr= new int[20];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random()*100);
        }   System.out.println(Arrays.toString(arr));

        quickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
//        ReentrantLoc
    }
}
