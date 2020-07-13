package 面试.算法.leetcode.Q66加一;

import java.util.Arrays;

public class Solution2 {
    public static int[] plusOne(int[] digits) {
        int flag = 1;
        int len = digits.length;
        int i = len-1;
        int[] res =  new int[len+1];
        while(i>=0){
            int tmp = digits[i] + flag;
            if (tmp==10){
                res[i+1] = 0;
                flag =1;
            }else {
                res[i+1] = tmp;
                flag = 0;
            }
            i--;
        }
        if (flag==1){
            res[0] =1;
            return res;
        }else{
            return Arrays.copyOfRange(res,1, res.length);
        }
    }

    public static void main(String[] args) {
        int[] arr= {9};
        int[] ints = plusOne(arr);
        for (int anInt : ints) {
            System.out.println(anInt);
        }
    }
}
