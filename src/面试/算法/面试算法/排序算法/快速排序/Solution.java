package 面试.算法.面试算法.排序算法.快速排序;

public class Solution {
     // 快速排序
     // 以中间的数为基准
     // 思路分析
     // 1 找到中间的值和下标
     // 2 设置两个索引值，一个指向左边，一个指向右边
     //
     public static void main(String[] args) {
      int[] arr= {-9,78,0,23,-567,70};
      quickSort(arr,0,arr.length-1);
         for (int i = 0; i < arr.length; i++) {
             System.out.print(arr[i]+" ");
         }
     }
      public static  void quickSort(int[] arr, int left ,int right){
         int l=left;
         int r=right;
         int temp=0;// 临时变量，作交换的时候使用
         int pivot = arr[(left+right)/2];
         // while 循环的目的，是让比pivot 值小的放到左边，比pivot 大的放到右边
         while(l<r){
             // 在pivot 左边一直找到大于等于pivot 的值退出
             while(arr[l]<pivot){
                    l+=1;
             }
             //再pivot右边找到小于等于pivot 的值，才退出
             while (arr[r]>pivot){
                  r-=1;
             }
             // 如果l>=r 成立说明 pivot 的左右两边的值已经排好
             if (l>=r){
                 break;
             }
             // 交换
             temp=arr[l];
             arr[l]=arr[r];
             arr[r]=temp;

             //如果交换完以后，如果发现arr[l] == pivot 值相等-- 前移
             if(arr[l]==pivot){
                 l--;
             }
             // 如果发现交换完了以后如果发现arr[r] == pivot 值相等++ 后移
             if(arr[l]==pivot){
                 r++;
             }
         }
         // 如果l==r  必须l++, r-- 否则栈溢出
         if(l==r){
             l++;
             r--;
         }
         // 向左递归
          if(left<r){
              quickSort(arr,left,r);
          }
          if(right>l){
              quickSort(arr,l,right);
          }
      }
}
