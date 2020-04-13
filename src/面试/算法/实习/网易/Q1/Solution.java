package 面试.算法.实习.网易.Q1;

import java.math.BigInteger;
import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

public class Solution {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        while(sc.hasNext()){
            int n = sc.nextInt();
            long[] arr= new long[n];
            for (int i = 0; i < n; i++) {
                arr[i]=sc.nextLong();
            }
            calcu(arr);    
        }
    }

    private static void calcu(long[] arr) {
        TreeSet<Long> set = new TreeSet<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j <arr.length ; j++) {
                long l = arr[j] - arr[i];
                if (l==0){
                    System.out.println(-1);
                    return;
                }
                set.add(l);
            }
        }
        int n = set.size();
        long[] t = new long[n];
        int temp = 0;
        for (Long aLong : set) {
            t[temp++]=aLong;
        }
        long cur =t[0];
        for (int i = 1; i < t.length; i++) {
            cur = gcd(cur, t[i]);
            if (cur==1){
                System.out.println(-1);

                return;
            }
        }
        System.out.println(cur);
    }
    public static Long gcd(Long m, Long n) {
        if (n == 0) {
            return m;
        }
        Long r = m % n;
        return gcd(n, r);
    }
}
