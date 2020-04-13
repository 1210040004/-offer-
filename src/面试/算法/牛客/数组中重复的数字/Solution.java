package 面试.算法.牛客.数组中重复的数字;

import java.util.Arrays;
public class Solution {
    // Parameters:
    //    numbers:     an array of integers
    //    length:      the length of array numbers
    //    duplication: (Output) the duplicated number in the array number,length of duplication array is 1,so using duplication[0] = ? in implementation;
    //                  Here duplication like pointor in C/C++, duplication[0] equal *duplication in C/C++
    //    这里要特别注意~返回任意重复的一个，赋值duplication[0]
    // Return value:       true if the input is valid, and there are some duplications in the array number
    //                     otherwise false
    public boolean duplicate(int numbers[],int length,int [] duplication) {
        //如果输入有效，并且有重复值就返回true 否则就传入false
        // 先对长度判断
        if(length<=1){
            return false;
        }
        Arrays.sort(numbers);
        for (int i = 0; i < length-1; i++) {
            if(numbers[i+1]==numbers[i]){
                duplication[0]=numbers[i];
                return true;
            }
        }
        return false;
    }

}