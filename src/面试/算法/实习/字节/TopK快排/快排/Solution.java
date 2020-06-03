package 面试.算法.实习.字节.TopK快排.快排;

import java.util.Arrays;

import static 面试.算法.实习.字节.缺失的第一个正数.Solution.swap;

public class Solution {
    int res;
    public  int findKthLargest(int[] arr, int k ){
         k = arr.length+1-k;
         findK(arr,k,0,arr.length-1);
         return res;
    }

    private  void findK(int[] arr, int k, int start, int end) {
        int i = start;
        int j = end;
        if (i>=j){
            return ;
        }
        int temp = arr[i]; // 枢轴点
        while(i < j){
            // 找比基准点大的数
            while(i<j && arr[j]>temp){
                j--;
            }
            // 从左往后找比基准点小的数
            while(i<j && arr[i]<=temp){
                i++;
            }
            if (i<j){
                swap(arr,i,j);
            }
        }
        swap(arr,i,start);
        if (i==k-1){
            res =temp;
            return;
        }
        findK(arr,k,start,i);
        findK(arr,k,i+1,end);
    }

    public static void main(String[] args) {
        int[] arr= {3,2,1,5,6,4};
        int r =  new Solution().findKthLargest(arr, 2);
        System.out.println(r);
        System.out.println(Arrays.toString(arr));
    }
    public static  int partition(int[] arr, int left, int right){
        int pivot = arr[left];
        int j = left;
        for (int i = left+1; i <=right ; i++) {
            if (arr[i]<pivot){
                j++;
                swap(arr,i,j);
            }
        }
        swap(arr,j,left);
        return j;
    }
}
