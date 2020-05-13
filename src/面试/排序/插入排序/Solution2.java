package 面试.排序.插入排序;

import java.util.Arrays;

import static 面试.排序.插入排序.Solution.swap;

public class Solution2 {
    public static void insertSort(int[] arr){
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j > 0; j--) {
                if (arr[j]<arr[j-1]){
                    swap(arr,j,j-1);
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
        insertSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
