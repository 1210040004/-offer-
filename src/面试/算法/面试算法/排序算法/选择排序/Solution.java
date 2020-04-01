package 面试.算法.面试算法.排序算法.选择排序;

public class Solution {
    // 选择排序的思路，
    // 每次都找最小的
    // 选择排序有数组个数-1 伦的排序
    // 每一轮排序，又是一个u想你换，循环的规则
    // 然后和后面的每个数比较，如果有比当前数更小的数吗， 就重新确立最小数，并得到下标。
    // 当遍历到数组的最后的时候， 就得到本轮的最小数和下标
    // 交换
    public static void chooseSort(int[] a){
        int n = a.length;
        for (int i = 0; i < n-1; i++) {
            int min=a[i];
            int index=i;
            for (int j = i+1; j < n; j++) {
                if(a[j]<min){
                    min=a[j];
                    index=j;
                }
            }
            if(index!=i){
                a[index]=a[i];
                a[i]=min;
            }
        }
    }

    private static void swap(int[] a, int i, int index) {
        int temp=a[i];
        a[i]=a[index];
        a[index]=temp;
    }

    public static void main(String[] args) {
        int[] a= new int[]{5,4,3,2,1};
        chooseSort(a);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
        }
    }
}
