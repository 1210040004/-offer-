package 面试.排序.插入排序;

import static 面试.排序.插入排序.Solution.swap;

public class Solution4 {
    public  static void insertSort(int[] arr){
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            for (int j = i; j >0 ; j--) {
                if (arr[j]<arr[j-1]){
                    swap(arr,i,j);
                }
            }
        }
    }

}
