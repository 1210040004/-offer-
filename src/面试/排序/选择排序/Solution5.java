package 面试.排序.选择排序;

import java.util.Arrays;

import static 面试.排序.选择排序.Solution2.swap;

public class Solution5 {
    public  static void chooseSort(int[] arr){
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            int minIndex = i;
            for (int j = i+1; j <n ; j++) {
                if (arr[j]<arr[minIndex]){
                    minIndex = j ;
                }
            }
            swap(arr,minIndex,i);
        }
    }

    public static void main(String[] args) {
        int[] arr= new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random()*100);
        }   System.out.println(Arrays.toString(arr));
        int[] temp= new int[10];
        chooseSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
