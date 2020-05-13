package 面试.排序.快速排序;

import java.util.Arrays;

import static 面试.排序.冒泡排序.Solution.swap;

public class Solution {
    public  static  void quickSort(int[] arr, int low, int high){
        int i = low;
        int j = high;
        if (i>j){
            return;
        }
        int k = arr[i]; // 基准数
        while(i<j){
            while(i<j && arr[j]>k){
                j--;
            }
            while(i<j && arr[i]<=k){
                i++;
            }

            if (i<j){
               swap(arr,i,j);
            }
        }
         // low 和 i 进行交换，i 是基准数应该在的位置
        swap(arr,low,i);
        quickSort(arr,low,i-1);
        quickSort(arr,i+1,high);
    }
    public static void sort(int[] a, int low, int height) {
        int i = low;
        int j = height;
        if (i > j) {    //放在k之前，防止下标越界
            return;
        }
        int k = a[i];
        while (i < j) {
            while (i < j && a[j] > k) {    //找出小的数
                j--;
            }
            while (i < j && a[i] <= k) {  //找出大的数
                i++;
            }
            if (i < j) {   //交换
                int swap = a[i];
                a[i] = a[j];
                a[j] = swap;
            }

        }
        //交换K
        k = a[i];
        a[i] = a[low];
        a[low] = k;
        //对左边进行排序,递归算法
        sort(a, low, i - 1);
        //对右边进行排序
        sort(a, i + 1, height);
    }

    public static void main(String[] args) {
        int[] arr= new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random()*100);
        }   System.out.println(Arrays.toString(arr));
        int[] temp= new int[10];



        quickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));

    }
}
