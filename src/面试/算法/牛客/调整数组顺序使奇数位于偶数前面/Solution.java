package 面试.算法.牛客.调整数组顺序使奇数位于偶数前面;

import java.math.BigInteger;

public class Solution {
    public void reOrderArray(int[] array){
        if(array==null||array.length==0){
            return;
        }
        if(array.length==1){
            return;
        }
        int i =0,j;
        int len=array.length;
        while(i<len){
            // 找到第一个偶数
            while(i<len&&array[i]%2==1){
                i++;
            }
            // 找到偶数后第一个奇数
            j=i+1;
            while(j<len&&array[j]%2==0){
                if (j == len - 1) {
                    return;
                }
                j++;
            }
            // 如果两个都中断了，那么在i- j-1 之间的数据都是偶数，那么就让 i到j-1 之间的数往后移动
            int temp=array[j];

            while (j > i) {
                array[j] = array[j - 1];
                j--;
            }
            array[i]=temp;
        }
    }
    public void reOrderArray2(int[] array){
        if (array== null || array.length==0 || array.length==1){
            return;
        }
        int i =0 ;
        int len = array.length;
        while(i<len){
            // 找到第一个偶数，
            while(i<len && array[i]%2==1){
                i++;
            }
            int j = i+1;
            while(j<len && array[j]%2==0){
                if (j==len-1){
                    return;
                }
                j++;
            }
            //存在于 i 到 j-1之间的数都是偶数，需要移动位置
            int temp = array[j];
            while(j>i){
                array[j]=array[j-1];
                j--;
            }
            array[i]=temp;
        }
    }

}
