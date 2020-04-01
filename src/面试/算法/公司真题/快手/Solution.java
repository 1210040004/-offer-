package 面试.算法.公司真题.快手;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        Long[][] arr= new Long[3][n];
        for (int i = 0; i < n; i++) {
            arr[0][i]=sc.nextLong();
        }
        for (int i = 1; i <n ; i++) {
            arr[1][i]=sc.nextLong();
        }
        for (int i = 2; i < n ; i++) {
            arr[2][i]=sc.nextLong();
        }
        long[][] dp = new long[3][n];
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < 2 ; j++) {
                long temp=Long.MAX_VALUE;
                for (int k = 0; k < 3; k++) {
                    temp=Math.min(Math.abs(arr[j][i]-arr[k][i-1])+dp[k][i-1],temp);
                }
                dp[j][i]=temp;
            }
        }
        System.out.println(Math.min(Math.min(dp[0][n-1],dp[1][n-1]),dp[2][n-1]));
    }
}
