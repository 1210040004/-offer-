package 面试.算法.实习.网易.Q1;

import java.util.Scanner;

public class Solution2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            long[] arr = new long[n];
            for(int i=0; i<n; i++){
                arr[i] = sc.nextLong();
            }
            getMaxGcd(n, arr);
        }
    }

    private static void getMaxGcd(int n, long[] arr) {
        long[] cut = new long[n-1];
        long cur = arr[1]-arr[0];
        for(int i=0; i<n-1; i++){
            cut[i] = arr[i+1] - arr[i];
            if(cut[i]==0){
                System.out.println(-1);
                return;
            }else{
                cur = gcd(cur,cut[i]);
            }
        }
        System.out.println(cur);
    }

    public static long gcd(long m, long n){
        if (n == 0) {
            return m;
        }
        return gcd(n, m%n);
    }

}
