package 面试.秋招.vivo提前批.Q1;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        while(sc.hasNext()){
            int n = sc.nextInt();
            int[] arr= new int[n];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }
            int res = calcu(arr);
            System.out.println(res);
        }
    }

    private static int calcu(int[] arr) {
        int i = 0, res = 0;
        while (i < arr.length) {
            //几个条件
            // 1 当前为0，并且前后均为0， 那么这个位置可以种花
            // 2 特殊case：
            /**
             * cas1 : 当前值为0，i==0,只需要看后面是否为0，如果只有长度1的话，也是可以种话的
             * case2 ：如果i是最后一个数，那么只需要看前面的是否为0即可了
             */
            if (arr[i]==0&&(i==0||arr[i-1]==0) && (i==arr.length-1||arr[i+1]==0)) {
                // 往下填
                arr[i] = 1;
                //计数++;
                res++;
            }
            if (arr[i] == 0 &&(i == 0|| arr[i-1] == 0) && (i==arr.length-1||arr[i+1]==0)){
                arr[i] = 1;
                res++;
            }
            i++;
        }
        return res;
    }
}
