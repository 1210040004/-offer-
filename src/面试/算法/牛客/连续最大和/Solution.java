package 面试.算法.牛客.连续最大和;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] f = new int[n];
        if (n==0){
            System.out.println(0);
            return;
        }
        for (int i = 0; i < n; i++) {
            f[i] = sc.nextInt();
        }

        if (n==1){
            System.out.println(f[0]);
        }
        int[] dp = new int[n];
        int max = f[0];
        dp[0] = f[0];
        for (int i = 1; i < n; i++) {
            dp[i] = Math.max(f[i],dp[i-1]+f[i]);
            max = Math.max(dp[i],max);
        }
        System.out.println(max);
    }
}
