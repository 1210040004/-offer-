package 面试.算法.牛客.调整奇数位置位于偶数前面;

// 输入一个整数数组，实现一个函数来调整该数组中数字的顺序，使得所有的奇数位于数组的前半部分，
// 所有的偶数位于数组的后半部分，并保证奇数和奇数，偶数和偶数之间的相对位置不变。
// 1 3 2 4 5 6
public class Solution {
    public void reOrderArray(int [] array) {
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