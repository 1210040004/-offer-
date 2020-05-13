package 面试.排序.归并排序;

import java.time.chrono.MinguoEra;
import java.util.Arrays;

public class Solution {
        // 如果两个数组有序，怎么进行排序？
        // 三个指针，指向left mid right
        public static void main(String[] args) {
            int[] arr= {8,4,5,7,1,3,6,2,0,234};
            int[] temp = new int[arr.length];
            Mergesort(arr,0,arr.length-1,temp);//需要额外的空间
            System.out.println("归并排序后"+ Arrays.toString(arr));

        }
    public static  void Mergesort(int[] arr, int left, int right,int[] temp){
            if (left<right){
                int mid = (left+right)/2; // 中间索引
                // 向左递归进行分解
                Mergesort(arr,left,mid,temp);
                //向右递归进行分解
                Mergesort(arr,mid+1,right,temp);

                // 到合并的时候，每分解一次就递归一次
                merge(arr,left,mid,right,temp);
            }
    }
    /**
     *
     * @param arr 排序的原始数组
     * @param left 左边有序序列的初始索引
     * @param mid 中间索引
     * @param right 右边索引
     * @param temp  做中转的数组
     */
    private static void merge(int[] arr, int left , int mid , int right , int[] temp) {
        System.out.println("进行合并");
        int i = left ;// 初始话i , 左边有序序列的初始索引
        int j = mid+1; // 初始话j， 右边有序序列的初始索引
        int t = 0;// merge 后下标的索引
        // 先把左右两边（有序）的数据，按照规则填充到temp数组中，直到左右两边有一边处理完毕为止
        while(i<=mid && j <=right){
            if (arr[i]<=arr[j]){
                temp[t++] =arr[i++];
            }else {
                temp[t++] = arr[j++];
            }
        }

        // 如果哪边有剩余，就把有剩余数据的一边的数据一次全部填充到temp 里面去
        while(i<=mid){
            temp[t++] = arr[i++];
        }
        while(j<=right){
            temp[t++] = arr[j++];
        }
        // 将temp 数组，重新拷贝到arr
        // 在并回去的过程中不是每次都拷贝所有
        t = 0;
        int templ = left;
        while (templ<=right){ // 第一次合并的时候templ = 0 , right =1
            arr[templ++]= temp[t++];
        }

    }
    static  void  swap(int[] arr , int i ,int j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
    }
}
