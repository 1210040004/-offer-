package 面试.排序.冒泡排序;

import java.util.Arrays;

import static 面试.排序.冒泡排序.Solution.swap;

public class Solution1 {
    public  static void bubbleSort(int[] arr){
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (arr[j]>arr[j+1]){
                    swap(arr,j+1,j);
                }
            }

        }
    }

    public static void main(String[] args) {
        int[] arr= new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random()*100);
        }   System.out.println(Arrays.toString(arr));
        int[] temp= new int[10];
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
