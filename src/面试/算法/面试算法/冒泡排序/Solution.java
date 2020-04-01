package 面试.算法.面试算法.冒泡排序;

public class Solution {
    public void BubbleSort(int[] arr){
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if(arr[j]>arr[j+1]){
                    int temp  = arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    }
}
