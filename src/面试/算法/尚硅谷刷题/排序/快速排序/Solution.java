package 面试.算法.尚硅谷刷题.排序.快速排序;

import com.sun.scenario.effect.impl.sw.java.JSWColorAdjustPeer;

public class Solution {
    public void quickSort(int[] arr,int left ,int right){
        int l =left;
        int r= right;
        int pivot = arr[(left+right)/2];
        while(l<r){
            // 找到一个大于pivot的值
            while(arr[l]<pivot){
                l++;
            }
            // 找到一个小玉pivot 的值
            while(arr[r]>pivot){
                r--;
            }
            // 如果l>=r 成立，说明pivot 左右两边的值已经全部
            // 小于等于pivot的值而右边全部大于等于pivot的值
            if (l>=r){
                break;
            }
            //
            swap(arr,l,r);
            // 交换完了如果发现arr[l]==pivot
            if (arr[l]==pivot){
                r--;
            }

        }
    }

    private void swap(int[] arr, int l, int r) {
        int temp = arr[l];
        arr[l] =arr[r];
        arr[r]=temp;
    }
}
