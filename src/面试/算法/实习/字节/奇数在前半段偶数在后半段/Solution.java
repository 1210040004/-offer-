package 面试.算法.实习.字节.奇数在前半段偶数在后半段;

public class Solution {
    public void reOrderArray(int [] array) {
        if (array== null || array.length==0 || array.length==1){
            return;
        }
        int i =0 ;
        int len = array.length;
        while(i<len){
            // 找到第一个偶数，
            //1 2 3 4 5 6 7 8
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
            //存在于 i 到 j-1之间的数都是偶数，需要移动位置.arr[i] 是偶数，而arr[j]是奇数，i到j-1的范围内都是偶数， 因此需要整体移位，
            // 再交换首尾
            int temp = array[j];
            while(j>i){
                array[j]=array[j-1];
                j--;
            }
            array[i]=temp;
        }

    }
}
