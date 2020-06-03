package 面试.算法.实习.字节.奇数在前半段偶数在后半段;

public class Solution2 {
    public void reOrderArray(int [] array) {
        if (array== null || array.length<=1){
            return;
        }
        for (int i = 0; i < array.length; i++) {
            // 找偶数
            while(i<array.length && array[i]%2==1){
                i++;
            }
            int j = i+1;
            // 找奇数
            while(j< array.length && array[j]%2==0){
                j++;
            }
            // i-j-1全是偶数，需要移位
            int tmp = array[j];
            while(j>i){
                array[j]=array[j-1];
                j--;
            }
            array[i]= tmp;
        }
    }
}
