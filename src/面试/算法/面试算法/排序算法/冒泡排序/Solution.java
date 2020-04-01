package 面试.算法.面试算法.排序算法.冒泡排序;

public class Solution {

    public static void bubbleSort(int[] a){
        // 第一次排序 ， 需要把最大的数放在最后
        int temp=0;// 临时变量
        for (int j = 0; j < a.length-1; j++) {
            for (int i = 0; i <a.length-1-j ; i++) {
                // 如果前面的数比后面的大就交换
                if(a[i]>a[i+1]){
                    temp=a[i];
                    a[i]=a[i+1];
                    a[i+1]=temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] a= new int[]{5,4,3,2,1};
        bubbleSort(a);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
    }
}
