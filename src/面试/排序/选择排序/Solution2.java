package 面试.排序.选择排序;

import java.util.Arrays;

public class Solution2 {
    public static  void chooseSort(int[] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            int minindex = i;
            for (int j = i+1; j < arr.length ; j++) {
                if (arr[j]<arr[minindex]){
                    minindex = j;
                }
            }
            swap(arr,i,minindex);
        }
    }
    public static  void swap (int[] arr,int i ,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
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
