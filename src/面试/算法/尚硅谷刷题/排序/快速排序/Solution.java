package 面试.算法.尚硅谷刷题.排序.快速排序;


public class Solution {
    public static void quickSort(int[] arr,int left ,int right){
        if (arr == null || arr.length == 0) {
            return;
        }
        if (left > right){
            return;
        }
        int l  =left;
        int r = right;
        int key  = arr[left];
        while(l<r){
            while(l<r && arr[r] >= key){
                r--;
            }
            while(l<r && arr[l] <= key){
                l++;
            }
            if (l<r){
                swap(arr,l,r);
            }
        }
        arr[left] = arr[l];
        arr[l] = key;
        quickSort(arr,left,l-1);
        quickSort(arr,l+1,right);
    }

    private static void swap(int[] arr, int l, int r) {
        int temp = arr[l];
        arr[l] =arr[r];
        arr[r]=temp;
    }

    public static void main(String[] args) {
        int n =1000;
        int[] arr= new int[1000];
        for (int i = 0; i < arr.length; i++) {
            arr[i]= (int)(Math.random()*100);
        }
        System.out.println(arr.toString());
        quickSort(arr,0,arr.length-1);
        System.out.println(arr);
    }
}
