package 面试.算法.实习.百度.Q2;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        int times=0;
        if(arr[n-1]<n) System.out.println(0);
        for(int i=n-1;i>=0;i--){
            int yushu=(arr[i]+times)%n;
            times=times+yushu;
        }
        System.out.println(times);
    }
}